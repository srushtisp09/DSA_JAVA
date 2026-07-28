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

// // q2WriteanarrowfunctionnamedisEven()thattakesasinglenumberasargumentandreturnsifitisevenornot.
//  const check=(n)=>{
//     if(n%2==0){
//         return "even";
//     }else{
//         return "not even";
//     }

//  };
// let n=9;
// check(n);

// u can use implicit return also

// let num=7;
// const isEven=(num)=> num%2==0;
// //q4
// // --> very imp question
// this in JavaScript — Complete Revision Notes

// Rule 1 — this depends on WHO calls the function
// Not where it's defined. Not where it's written. Who calls it.

// 4 Cases of this
// Case 1 — Global scope
// javascriptconsole.log(this); // window
// this at top level = window object.

// Case 2 — Regular function called alone
// javascriptfunction greet(){
//     console.log(this); // window
// }
// greet(); // window is calling it

// Case 3 — Method called on object
// javascriptconst student = {
//     name: "Srushti",
//     greet: function(){
//         console.log(this); // student object ✅
//     }
// }
// student.greet(); // student is calling it

// Case 4 — Regular function inside method (callback trap)
// javascriptconst student = {
//     name: "Srushti",
//     greet: function(){
//         function inner(){
//             console.log(this); // window ❌ not student
//         }
//         inner(); // called as plain function
//     }
// }
// student.greet();
// Even though inner is inside the object's method — it's called as a plain function → this = window.

// Arrow Function Fix
// javascriptconst student = {
//     name: "Srushti",
//     greet: function(){
//         const inner = () => {
//             console.log(this); // student ✅
//         }
//         inner();
//     }
// }
// Arrow functions inherit this from parent scope — parent is greet which is called on student → this = student.

// var vs let with this
// javascriptvar name = "global";  // attached to window
// let age = 20;         // NOT attached to window

// console.log(this.name); // "global" ✅
// console.log(this.age);  // undefined ❌

// setTimeout trap
// javascriptconst obj = {
//     name: "Srushti",
//     greet: function(){
//         setTimeout(function(){
//             console.log(this); // window ❌
//         }, 1000);
        
//         setTimeout(() => {
//             console.log(this); // obj ✅ arrow fixes it
//         }, 1000);
//     }
// }

// Quick Reference Table
// SituationthisGlobal scopewindowRegular function called alonewindowMethod called on objectthat objectRegular function inside methodwindowArrow function anywhereinherited from parentsetTimeout with regular functionwindowsetTimeout with arrow functioninherited from parent

// Interview Questions Pattern
// Whenever you see this in a question — ask these 3 questions:

// Is it an arrow function or regular function?

// Arrow → look at parent scope
// Regular → look at who calls it


// Who is calling this function?

// obj.method() → obj
// method() → window


// Is the variable declared with var or let?

// var → attached to window
// let/const → not attached to window




// The Callback Trap (most common interview trick)
// javascriptlet length = 4;      // let → not on window

// function callback(){
//     console.log(this.length); // this = window, window.length = 0
// }

// const obj = {
//     length: 5,
//     method(callback){
//         callback(); // plain call → this = window
//     }
// }

// obj.method(callback); // output: 0
// Traps:

// length = 4 → makes you think 4
// length: 5 → makes you think 5
// Real answer → 0 because let + plain call + this = window

//ARRAY METHODS
// let arr=[1,2,3,4,5,6];
// function print(){
//    console.log(el);
// };
// // arr.forEach(print);
// //OR
// arr.forEach(function(el){
//    console.log(el);
// });

// //  //we can also use arrow functiona
// //  arr.forEach((el)=>{
// //    console.log(el);
// //  });
//  //we can also use for each for objects
//  let arr=[{
//    name:"aman",
//    age:23,
//  },
// {
//    name:"shreya",
//    age:21,
// },
// {
//    name:"yashu",
//    age:12,
// }];
// arr.forEach((student)=>{
//    console.log(student.age);
// });

// //MAP FUNCTION
// let num=[1,2,3,4,5,6];
// let newarrr=num.map(function(el){
//    return el*2;
// })
// let gpa=arr.map((el)=>{
// //    return el.age/10;
// // });


// ///FILTER FUNCTION
// let nums=[2,4,1,5,6,2,7,8,9];
// let ans=nums.filter((el)=>{
//    return el%2==0;
// })

//EVERY ---> only returns true or false
  
// [1,2,3,4].every((el)=>el%2==0);
// --> false
//[1,2,3,4].every((el)=> el%2!=0);
// --->false;


//SOME-->returns true if some element gives true else false
// [1,2,3,4].some((el)=>el%2==0);
// -->true

//REDUCE--> reduces the  arr elements to single value
// // [1,2,3,4].reduce((res,ele)=>(res+ele)); 
// // -->10

// ///MAXIMUM ELEMENT IN AN ARRAY
// let arr=[1,4,2,5,6,7,2,9,2];
// let max=-1;
// for(let i=0;i<arr.length;i++ ){
//    if(arr[i]>max){
//       max=arr[i];
//    }
// }
// console.log(max);




///using reduce function
// let arr=[2,3,4,67,134,3];
// let max=arr.reduce((max,el)=> {
//    if(max<el){
//       return el;
//    }else{
//       return max;
//    }
// });
// console.log(max);


///PRACTICE QUESTION
// //Q1
// let arr=[10,20,30,40,50];
// // arr.every((el)=>el%10==0); 

// //Q2
// let arr=[12,3,4,5];
 
// let min=arr.reduce(function(min,el){
//    if(min>el){
//        return el;
//    }else{
//       return min;
//    }
// })
// console.log(min);

// //DEFAULT PARAMETERS
// function sum(a,b=3){
//   return a+b;

// }
// sum(2,5) //overhere b value will be 3
// --> b is the default parameter

//SPREAD---> EXpand an iteral into multiple values
// let arr1=[1,2,3,4,5,6,8,90];
// Math.min(...arr); over here individual elements will be passed into arr
// --> // this will return min of array

//SPREAD WITH ARRAY LITERAL
// let arr= [1,2,4,5,6];
// let  newarr=[...arr];
// //also with stringss
// let char=[..."hello"];
// let odd=[1,3,5,7,9];
// // let even=[2,4,6,8,10];
// // let nums=[...odd,...even,] --> order is followed here

// //SPREAD WITH OBJECT LITERAL 
// const data={
//    email:'ironman@gmail.com',
//    password:'abcd',

// };
// const dataCopy={...data,id:123};


///let say we want to convert arr to object
// then //
// consider a array 
//as we know an object stores values as key and value pair 
// since we are only spreading the arr this means we only have arr values, so to store
//as key value pair it will automatically use index as keys 
// //same happens when ur converting string to object using spread
// let arr=[1,2,3,4,5];
// let obj1={...arr};
// let obj2={..."hello"};


//####REST-->ALLOWS A function to take an indefinite number of arguments and bundle them in a array
// Collects multiple arguments into an array:
//Use when you don't know how many arguments will be passed.

// function sum(...args){
//  return args.reduce((add,el)=> add+el);
// }
// function sum(...args){
//    for(let i=0;i<args.length;i++){
//       console.log("you gave us :",args[i]);
//    }
// }
// sum(1,2);
// function min(){
//    console.log(arguments.length);---> over here u pass arguments which is basically collections
//    console.log(arguments); --> in this if u dont pass paramteres also you get output because it is inbuilt 
// }                          --> you cant push or pop on arguments
// function min(msg,...args){ --> we can also have other paramater along with the arguments but this should be added before the arguments
//    console.log(msg);
//    return args.reduce((min,el)=>{
//       if(min>el){
//          return el
//       }else{
//          return min;
//       }
//    });
// }


//# destructing 
// destructing referes to store values of array into multiple variables
//storing one  by one through the index would need a lot of time
//thus this can be done by using destructing 
// but only the element of 0 th index and 1st index will be added to variable
// it is done order wise
// so when u do that the elemnt of 0 th index will be stored in winner and the element of 1st index wil be stored in the second variable
//
// let names=["srushti","kiara","kishi","sua"];
// let [winner,runnerup,other]=names;


// we can also combine the topic of rest and destructing 
// if we need to access all the elements including winner and runner up we can write ...args
// then all the arguments will be returned
// let names=["srushti","kiara","rishi"];
// let[winner,runnerup,...args]=names;



//DESTRUCTING for objects
const student={
   name:"karan",
   age:21,
   class:8,
   subjects:["hindi","english","math","science"],
   password:"wsre",
   username:"heloo123"
}
 let{username,password}=student;
 //you can also write like this
//  let{username:user,password}=student;///here if u search username u wont get anything instead if u search user then you get the answer
//you can also assign default value
let{username,password,city="Mumbai"}=student;