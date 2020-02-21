<#
.SYNOPSIS
    Shows when last your PC Started up.
.DESCRIPTION
    This is a WMI wrapper funtion to get the time that your PC last started up.
.PARAMETER ComputerName
    The name ofthe Computer you want to run the command against.
.EXAMPLE
    Get-LastBootTime -ComputerName Localhost
.LINK
    www.howtogeek.com
#>
param(
    [Parameter(Mandatory=$true)][string]$ComputerName
    )

Get-WmiObject -class win32_operatingSystem -ComputerName localhost 
Select-Object -Property CSName,@{n="Last Booted";
e={[Management.ManagementDateTimeConverter]::ToDateTime($_.LastBootUptime)}}