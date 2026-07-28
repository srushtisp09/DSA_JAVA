// let btn=document.querySelector("button");
// console.dir(btn);
// // btn.onclick=function(){
// //      alert("function was clicked");
// // }
// btn.onmouseenter=function(){
//     console.log("Ohh u hovered ");//onmouseenter is triggered when u hover
// }
// function sayHello(){
//    console.log("hello");
// }
// function sayName(){
//     console.log("Helooo");
// }
// btn.onclick=sayHello;
// // if u want to choose multiple btns then use document.querySlectorAll
// // use a for loop  for(btn of btns) btn.onclick=sayhello 
// //we are assigning only the function name to the btn.onclick
// //
// //EVENT LISTENER--> when multiple alerts or actions cant take place at a time we use eventListener for the multiple actions
// //element.addEventListener(event,callback)
// // events can be anything like click drag etc event listener can be unlimited there
// //is no limit for that
// btn.addEventListener("click",sayHello );
// btn.addEventListener("click ",sayName);
// // // you can refer many events from mdn
// let btn=document.querySelector("button");
 
// btn.addEventListener("click",function(){
//     let h3=document.querySelector("h3");
//     let randomColor=getRandomColor();
//     h3.innerText=randomColor;

//     let div=document.querySelector("#colorbox");
     
//    div.style.backgroundColor = randomColor;
// console.log(div.style.backgroundColor); // add this
// });
// function getRandomColor(){
//     let red=Math.floor(Math.random()*255);
//     let blue=Math.floor(Math.random()*255);
//     let green=Math.floor(Math.random()*255);
//     let color=`rgb{${red},${blue},${green}}`;
//     return color;
// // }
// let p=document.querySelector('p');
// p.addEventListener("click",function(){
//     console.log("the para was clicked");
// });
// let box=document.querySelector(".box");
// box.addEventListener("mouseenter",function(){
//     console.log("mouse inside the box");
// })
// let btn=document.querySelector('button');
// btn.addEventListener("dblclick",function( event){ ///event is a default argument it can be written as anything like e or anything
//     console.log(event);
// console.log("Clicked");
// })
//double click dblclick is a mouse event
// event gives u info about the events
//refer to mdn for more events
// let input=document.querySelector('input');
// input.addEventListener("keydown",function(event){
//     console.log(event);
//     console.log("presssed");
// })
//the keydown works or gets triggered when  u press any of the key
//many keyboard events are present in mdn 
//importtant paramter are code and key 
//key tells you what key is been pressed
// // code returns the code of that particular key
// //
// let inp=document.querySelector('input');
// inp.addEventListener("keydown",function(event){
//     console.log("code=",event.code);
//     if(event.code=="KeyD"){
//         console.log("Character moves down");
//     }else if(event.code=="KeyU"){
//         console.log("Character moves up");
//     }else if(event.code=="KeyL"){
//         console.log("ArrowLeft");
// //     }else if(event.code=="KeyR"){
// //         console.log("ArrowRight");
// //     }
// // // });
// let form=document.querySelector('form');
// form.addEventListener("submit",function(event){
// //     //Every time u cant create a document.querySelctor to access the elemnst instead u can do this
// //     // use form and access teh elements
//     event.preventDefault();
// // console.dir(form);
// // let user=this.elements[0]; //form .elements[0] 
// // let pass=this.elements[1];
// //     // console.log("Registered");
// //     // alert("yoo whatsupp");
// //     // event.preventDefault();
// //     // let inp=document.querySelector('input');
// //     // console.dir(inp);
// //     // // console.log( inp.innerText); // over here in the input object the value of input does not get stored in 
// //     // // innerText but instead the text tht we type in th placeholder will be stored in value 
// //     // // so if u want to print the value of the text use the below
// //     // console.log(inp.value);  
// //     // let user=document.querySelector('#user');
// //     // // let pass=document.querySelector('#pass');
// //     // console.log(user.value);
// //     // console.log(pass.value);
// //     // alert(`hi ${ user.value},your password is set to ${pass.value}`);

// }); 

//so if u want the form to be such that  it does not go to the action page
// and want it tobe on the index or browser page only then use event.preventDefault()
//this prevents the page from going to action page
// in this way u can do it
//EXTRACTING FORM DATA
// we use addEvent Listener






// the change event helps you to track let say in ur placeholder u type something like abcd and then when u click u see the 
// // updated value the change doesnt take place when u just typr the letters
// // but when u type everything and then click submit then it submits
// //if u want to track all the inputs like when u type a and soo on then use input
//     let user=document.querySelector('#user');
// // user.addEventListener("change",function(){
     
// //     console.log("User value changed");
// //     console.log("final value",this.value)
// // });

// // user .addEventListener("input",function(){
// //     console.log("input event");
// //     console.log("final value",this.value)
// // });
// // over her only character keys are considered and not non character keys

// let heading=document.querySelector("#heading");
//  let input=document.querySelector("#user");
//  input.addEventListener("input",function(){
//     let value=input.value;
//     let filtered="";
// for(let i=0;i<value.length;i++){
//     let ch=value[i];
//     if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch==' ')){
//     filtered+=ch;
//   } 
// }
// input.value=filtered;
// heading.innerText=filtered;

// //  });


//  let div=document.querySelector("div");
//  let ul=document.querySelector("ul");
//  let lis=document.querySelector("li");
//  div.addEventListener("click",function(event){
//     event.stopPropagation();
//     console.log("div was clicked");
//  });
//  ul.addEventListener("click",function(event){
//     event.stopPropagation();
//     console.log("ul was clicked")
//  });
//  lis.addEventListener("click", function(event){
//     event.stopPropagation();
//     console.log("lis was clicked");
//  })
 //over here when u click list then u see that the parent elemnets also get displayed 
 // this is event bubbling wherein the task along with its parent is executed
 // so inorder to prevent this we use event.stopPropogation() using this only that particular
 // elemnt will be displayed





 //// TO DO APP
 let btn= document.querySelector("button");
 let ul=document.querySelector("ul");
 let inp=document.querySelector( "input");
 btn.addEventListener("click",function(){
    let item=document.createElement("li");
    item.innerText=inp.value;

    let button=document.createElement("button");
    button.innerText="delete";
    button.classList.add("delete");
   

    item.appendChild(button);
    ul.appendChild(item);
     inp.value="";



 });
 ul.addEventListener("click",function(event){
    console.log(event.target);
    console.log("clicked");
 });

//  let deletebutton=document.querySelectorAll(".delete");
//  for(dbtns of deletebutton){
//     dbtns.addEventListener("click",function(){
//          let parent=this.parentElement;
//          parent.remove();
//     })
//  }