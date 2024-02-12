let monitor = document.getElementById('monitor');
let index;
let timerId;

function Multification() {
  index = 1;
  clearTimeout(timerId);
  var numInput = document.getElementById('num');
  var numValue = parseInt(numInput.value);
  while (monitor.firstChild) {
    monitor.removeChild(monitor.firstChild);
  }
  if (isNaN(numValue)) {
    alert('숫자를 입력해 주세요.');
    numInput.value = '';
  } else {
    printing(numValue);
  }
}

function printing(num) {
  if (index < 10) {
    var newElement = document.createElement('div');
    newElement.innerText = num + ' * ' + index + ' = ' + num * index;
    monitor.appendChild(newElement);
    index++;
    timerId = setTimeout(function () {
      printing(num);
    }, 500);
  }
}
