<?php

function print_friend_list (){
     $friends = ["Bob", "Anna", "<script>alert('hello');</script>", "Sally"];
     
     <?php foreach ($friends as $friend) :?>
     <ul>
     <li><?=$friend; ?></li>
     </ul>
     <?php endforeach;?>
     
}
?>