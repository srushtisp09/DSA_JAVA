// const student={
//     name:"Shraddha",
//     age:21,
//     eng:34,
//     math:32,
//     phy:31,
//     avg(){
//         console.log(this);
//         let avg=(this.eng+this.math+this.phy)/3;
//         console.log(avg);
//     }
// }
// ///when u just write eng mth and phy then the function will give  u error 
// // it cant access the variables thus to solve this problem we use this keyword to refer to the object that we are using so this key
// // word is used to refere to the object that we are using 
// // also when u write console.log(this) then it meansthat 
// // it will give u the object but by default u have windom object which is a high level object on tab lets say
// // u open the index.html file then a windows 
// // object is present over there which consists of a lot of functions //
// // thus by default when u have no object then it means
// //that u are using the window object




// function getFunc(){
//     console.log(this);
// }

// ///TRY AND CATCH
// console.log(a);
//you get an eror over here coz a is not defined

//lets say u have the following sentences
// console.log("hello");
//console.log("hello");
//console.log(a);
//console.log('helllo");
///over here  u get an eerror due to third statement 
//due to undefined variable a due to which the next statements wont run
// to avoid this we will use try catch so basically 
//whenever u have doubts on line that u feel would cause error
// then u can add that in try loop try will check if error exists and send this error to
// catch loop and catch will identify the error 
// and correct it and will let the other lines run it wont disturb 
// u can also pass the error as argument in catch 


//MISCELLANEOUS TOPICS
///ARROW FUNCTIONS-- these functions are nameless function they are used as variables or as call backs in 
// higher order function these functions are the same as normal function execution but are quite different 
// the syntax is much more compact then  normal function.THese are not standalone functions like normal functions thees are stored 
// as variables

const func=(a,b)=>{
    console.log(a+b);

 };

 const cube=(n) =>{
    console.log(n*n*n);
 }
 const pow=(a,b)=>{
    return a**b;
 }
 //special things about arrow function--
 // in case whne u have one argument then the necessity of () is not required
//  const cube=n=>{
//     return n**n;
//  }\
//if at all u  have no arguments then u cant remove the
// // paranthesis u need to add it compulsory
// const time=()=>{
//     console.log("HYIU");
// } 
// if u have no arguments and u just write it without the 
 //paranthesis then it will return error


 //we also have IMPLICIT RETURN 
 //here only return work happens nothing else 
 //   explicit means we are suppossed to telll it 
 //implicit means the function gets to knwo what we are returning
  // the syntax becomes much more compact than the arrow function
//   const sum=(a,b)=>(a*b);


//CALLBACK FUNCTION-->Any function that is sent as argument in the function is called 
//as callback function  
//settimeout(function,timeout)-->over here function is the callback ad timeout is after this much time the function will work  after 
// the given delay like let say 5s delay it means 5000 ms delay then the function will work
// we need to multiply 1000 coz 1s-->1000ms




  //SET TIME OUT  FUNCTION--it is an inbuilt function
// // setTimeout(function,timeout);,,used for api calls
// console.log("Hi there");
// setTimeout( ()=> {
//     console.log("apna college");

// },4000);
// console.log("WElcome to")



//SETINTERVAL ---> the set interval will keep executing after certain interval
//every interval in which it prints has an id that is the reason y we gave ita variable id 
//in ur output window the id will also be printed to clear the intervals 
/// we write clearInterval(theid that u want to stop) clearInterval(id1) or clearInterval(id2)
// setInterval(function,timout)
// let id=setInterval(()=>
// {
//     console.log("Apna College")
// },2000);
// console.log(id);

// let id2=setInterval(()=>
// {
//     console.log("HI there")
// },2000);
// console.log(id);

//imp for interviews

//THIS WITH ARRAOW FUNCTION(IMP) -----> there are two types of methods 
//1. Normal function and the other is Lexical Scope 
//In normal function when u call the function it will return the this of the calling object like let say 
// u made a student object and ur making a normal function and using this in thet then over here the this here refers to the student obect 
// //also in ur student object if u  write this here the student obejct is in global scope so over here the this keyword referes to windows and not the object
// // Lexical Scope : when u refere to this in the arrow function then it uses the this of the parents function whatevre
// // is the this of the parenst function that it self will be the this of arrow function

// const a=0;// has a global scope
// const student={  // ---> global scope
//     name:"Srushti",
//     marks:45,
//     age:21,
//     prop:this,// ----->window because the object is global scope so window is the this

//     getName:function(){
//         console.log(this);
//         return this.name;
//     } ,
//     // getMarks:()=>{
//     //     console.log(this);
//     //     return this.marks; 
//     // } ---> this gives undefined

//     getInfo1:function(){
//         setTimeout(()=> {
//             console.log(this);/// Over here the this is refered to parents this 
//             // here the parent is  the function so in previous function the this referes to student so the student itslef is
//             // is used as this
//         },2000);
//     },
//     getInfo2:function(){
//         setTimeout(function() {
//             console.log(this); //   setTimeout is called by the browser/window internally. So when the callback runs, this = window.
//     })

// }Function type      this
// Regular function    who ever calls it 
// Arrow function       inherited from parent scope
//   This concept is called this binding

//practice questions
//1.write an arrow function that returns the square of a number 'n
//2.Write a function that prints "Hello World 5 times at intervals of 2s each
// 
//sol:1
//    let square=((num)=>{
//     return num*num;
//     });
//     square(5);
//  // sol2:
//  let id=setInterval(()=>{
//     console.log("Hello world");
//  },2000);
//  setTimeout(()=>{
//     clearInterval(id);
//  },1000);
 //setInterval — runs a function repeatedly every X milliseconds:
 //Returns an id so you can stop it later.

 //setTimeout — runs once after X milliseconds:
//  Summary:

// setInterval → repeat every X ms
// setTimeout → run once after X ms
// clearInterval → stop a running interval
// Always store interval in a variable so you can clear it later 
//Both start at t=0:

// Interval fires at 2000ms → prints
// Timeout fires at 3000ms → clears interval

// Since interval (2000ms) < timeout (3000ms) → prints once before getting cancelled.


// //PRACTICE QUESTIONS
// //Q1: 
//  const arrayAverage=(arr)=>{
//     let avg=0;
//     for(let i=0;i<arr.length;i++){
//         avg+=arr[i];
//     }
//     return avg/arr.length; 
//     } 
//     let arr=[1,2,3,4,5,6,7,8,9,10];
//     console.log(arrayAverage(arr));

// q2WriteanarrowfunctionnamedisEven()thattakesasinglenumberasargumentandreturnsifitisevenornot.
 const check=(n)=>{
    if(n%2==0){
        return "even";
    }else{
        return "not even";
    }

 };
let n=9;
check(n);

// u can use implicit return also

// let num=7;
// const isEven=(num)=> num%2==0;