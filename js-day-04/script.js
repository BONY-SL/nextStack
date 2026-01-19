let input = document.getElementById('inputField');

input.addEventListener('keyup',(event) => {
    console.log(event.target.value);
})

let outerEl=document.getElementById('outer');
let innerEl=document.getElementById('inner');
let btnEl=document.getElementById('btn');

outerEl.addEventListener('click',(e)=>{
    console.log('outer');e.stopPropagation();
})
innerEl.addEventListener('click',(e)=>{
    console.log('inner');
    e.stopPropagation();
})
btnEl.addEventListener('click',(e)=>{
    console.log('btn');
    e.stopPropagation()
});