function getInputValue() {
  // input 요소의 id를 사용하여 해당 요소를 찾고, value 속성을 통해 입력된 값을 가져옴
  var numInput = document.getElementById('num');
  var numValue = numInput.value;

  // 가져온 값 활용 예시: 얼럿 창에 출력
  alert('입력된 사용자 이름: ' + numValue);
}
