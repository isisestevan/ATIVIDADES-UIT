<?php

do{
  $playerOne = readline('Player 1 (X) - Digite o seu nome: ');
  $playerTwo = readline('Player 2 (O) - Digite o seu nome: ');

  $player = 'X'; //player 1 começa o jogo

  $board = [   
    '.','.','.',
    '.','.','.',   //tabuleiro começa com todos vazios
    '.','.','.',
    ]; 

  $winner = null;

  while ($winner === null) { //enquanto n tiver um vencedor
         
               echo <<<EOL
             Posições: | Tabuleiro
                       |
               0|1|2   |   $board[0]|$board[1]|$board[2]
               3|4|5   |   $board[3]|$board[4]|$board[5]
               6|7|8   |   $board[6]|$board[7]|$board[8]\n
            EOL
        ;
    $position = (int) readline("Player {$player}, digite a sua posição: ");

    if(!in_array($position, [0,1,2,3,4,5,6,7,8])) { //se a posição n existe
      echo "\nPosição inexistente, digite novamente.\n";
      continue; 
    } 
    if ($board[$position] !== '.') {     //se a posição estiver ocupada
        echo "\nPosição ocupada, digite novamente.\n";
      continue;
    } 

    $board[$position] = $player;  //armazena o player no lugar do tabuleiro escolhido

    if ( //combinações vencedoras de X
        ($board[0] === 'X' && $board[1] === 'X' && $board[2] === 'X') ||
        ($board[3] === 'X' && $board[4] === 'X' && $board[5] === 'X') ||
        ($board[6] === 'X' && $board[7] === 'X' && $board[8] === 'X') ||  
        ($board[0] === 'X' && $board[3] === 'X' && $board[6] === 'X') ||
        ($board[1] === 'X' && $board[4] === 'X' && $board[7] === 'X') ||
        ($board[2] === 'X' && $board[5] === 'X' && $board[8] === 'X') ||
        ($board[0] === 'X' && $board[4] === 'X' && $board[8] === 'X') ||
        ($board[2] === 'X' && $board[4] === 'X' && $board[6] === 'X') 
    ) {
      $winner = 'X';
    } 

    if ( //combinações vencedoras de O
        ($board[0] === 'O' && $board[1] === 'O' && $board[2] === 'O') ||
        ($board[3] === 'O' && $board[4] === 'O' && $board[5] === 'O') ||
        ($board[6] === 'O' && $board[7] === 'O' && $board[8] === 'O') ||  
        ($board[0] === 'O' && $board[3] === 'O' && $board[6] === 'O') ||
        ($board[1] === 'O' && $board[4] === 'O' && $board[7] === 'O') ||
        ($board[2] === 'O' && $board[5] === 'O' && $board[8] === 'O') ||
        ($board[0] === 'O' && $board[4] === 'O' && $board[8] === 'O') ||
        ($board[2] === 'O' && $board[4] === 'O' && $board[6] === 'O') 
    ) {
      $winner = 'O';
    } 

    if (!in_array('.', $board)){ //se n exisitr mais ponto no board é empate
      break;
    } 

    if($player === 'X') { //mudar a ordem dos jogadores a cada rodada
       $player = 'O';
    } else {
       $player = 'X';
    }
  } 

         echo <<<EOL
             Posições: | Tabuleiro
                       |
               0|1|2   |   $board[0]|$board[1]|$board[2]
               3|4|5   |   $board[3]|$board[4]|$board[5]
               6|7|8   |   $board[6]|$board[7]|$board[8]
            EOL
        ;

  if ($winner === 'X') {
    echo "VENCEDOR: {$playerOne}.\n";
  } elseif ($winner === 'O') {
    echo "VENCEDOR: {$playerTwo}.\n";
  }else {
    echo"EMPATE.\n";
  } 

  $playAgain = filter_var(
    readline("\nDeseja jogar novamente? (true/false): "),
    FILTER_VALIDATE_BOOLEAN
  );
     
  
} while ($playAgain === true);