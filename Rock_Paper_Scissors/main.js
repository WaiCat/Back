let rock = document.getElementById('rock');
let scissors = document.getElementById('scissors');
let paper = document.getElementById('paper');
let hand = '';

let user_score = document.getElementById('user_score');
let com_score = document.getElementById('com_score');
let result = document.getElementById('result');
let hand_img = document.getElementById('hand_img');

function click_hand_button(button) {
  if (button == 'rock') {
    rock.style.backgroundColor = 'gray';
    hand = 'rock';
  } else {
    rock.style.backgroundColor = 'white';
  }

  if (button == 'scissors') {
    scissors.style.backgroundColor = 'gray';
    hand = 'scissors';
  } else {
    scissors.style.backgroundColor = 'white';
  }

  if (button == 'paper') {
    paper.style.backgroundColor = 'gray';
    hand = 'paper';
  } else {
    paper.style.backgroundColor = 'white';
  }
}

var index = 0;
const choice = ['rock', 'scissors', 'paper'];

function changeImage() {
  if (index < choice.length) {
    hand_img.src = './img/' + choice[index] + '.png';
    result.innerText = choice[index] + '!';
    index++;
    setTimeout(changeImage, 800);
  } else {
    setTimeout(() => {
      start();
    }, 100);
  }
}

function start() {
  const randomIndex = Math.floor(Math.random() * choice.length);

  const com = choice[randomIndex];
  console.log(com);

  resultinner = result.innerText;

  if (com == hand) {
    resultinner = '무승부';
  } else if (com == 'rock') {
    if (hand == 'scissors') {
      resultinner = '패배...';
    } else if (hand == 'paper') {
      resultinner = '승리!';
    }
  } else if (com == 'scissors') {
    if (hand == 'paper') {
      resultinner = '패배...';
    } else if (hand == 'rock') {
      resultinner = '승리!';
    }
  } else if (com == 'paper') {
    if (hand == 'rock') {
      resultinner = '패배...';
    } else if (hand == 'scissors') {
      resultinner = '승리!';
    }
  }

  hand_img.src = './img/' + com + '.png';

  if (resultinner == '패배...') {
    com_score.innerText = parseInt(com_score.innerText) + 1;
  } else if (resultinner == '승리!') {
    user_score.innerText = parseInt(user_score.innerText) + 1;
  }
  result.innerText = '컴퓨터는 ' + com + '이므로 ' + ' ' + resultinner;

  //alert(resultinner);
  //click_hand_button();
  index = 0;
}

function reset() {
  location.reload();
}
