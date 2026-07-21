// function hello(){
//     console.log("hello");
// }
// hello();
// function printName(){
//      for(let i=1;i<=4;i++ ){
//         console.log("helooib");
//      }

// }
// printName();
// function isAdult(){
//     let age=18;
//     if(age<=18){
//         console.log("Adult");
//     }else{
//         console.log("Not adult");
//     }
// }
// isAdult();
// practice question
// function printPoem(){
//     console.log("Twinkle Twinkle little star ");
//     console.log("How i wonder what you r ");
//     console.log("up above the world so high like a diamond in the sky");
// }
// printPoem();
// function rollDice(){
//     let roll=prompt("Roll the dice");
//     let val=Math.floor(Math.random()*6)+1;
//     console.log(val);
// }
// rollDice();
//
// function PrintName(name,age){
//     console.log(`${name}   is of age ${age}`);
// }
// PrintName("srushti",21);
// PrintName("Riya");
// // the above statement is valid it doesnt cause error 
// PrintName(12);
//in this case  the 12 gets stored  in the string because in js order plays a imp role
// whatever u pass as the first argument will be stored in the first argument 
// itself

// function sum(a,b)
// function sum(a,b){
//     console.log(a+b);
// }
// sum(3,5);
// average of three numbers
// function average(a,b,c){
//      let avg=(a+b+c)/3;
//      console.log(avg);
// }
// average(2,3,4);
 
 // return statement
//  function sum(a,b){
//     return a+b;
//  }
//  let a=sum(sum(1,2),3);  // trick a new way
// let s=sum(2,3);
// console.log(s);
// console.log(a);
//  once the return statement is executed the code is done ,no statements 
// // written after the return statement executes
// function isAdult(age){
//     if(age>=18){
//         return "isAdult";
//     }else{
//         return "Not adult";
//     }
// }
// isAdult(18);

// 1 to n sum
 
// function sum(n){
//     let sum=0;
//     for(let i=1;i<=n;i++){
//            sum+=i;
//     }
//     return sum;
// }
// let s=sum(5);
// console.log(s);

//practice question 
// let array=["hi","hii","hiiii","hiiiiii"];
// function concate(array){
//     let result="";
//     for(let i=0;i<array.length;i++){
//         result+=array[i];
//     }
//     return result;
//     }
 //let sum=67; //global scope
//   function calcSum(a,b){
//     let sum=a+b; ///function scope
//  function innergreet(){
//     console.log("HG"); lexical scope
//  }
//   }
// //   console.log()
//  let age=23;
//  if(age>=18){
//     let str="adult";
//  }
// //  console.log(str);
// function outerFunc(){
//     let x=5;
//     let y=6;
//     function innerFunc(){
//         console.log(x);
//     }
    
// innerFunc();
// // } 

// // //hoisting the variables can be used in the function before declaration
// // //practice 7
// // hello
// // namaste
// const sum=function sum(a,b){
//      return a+b;
// }
//  let hello=function print(){
//     console.log("Helloo");
//  } 
// //  console.log(hello);


// // //HIGH ORDER FUNCTION
// // function multipleGreet(func,n){   -----> higher order function
// //     for(let i=1;i<=n;i++){
// //         func()
// //     }
// // }
// // let greet=function(){
// //     console.log("hello");
// // }
// // multipleGreet(greet,2);

// let odd=function(n){
//     console.log(n%2==0);
// }
// let even=function(n){
//     console.log(n%2==0);
// }

// function oddOrEvenTestFactory(request){
//     if(request=="odd"){
//        let odd=function(n){
//         console.log(!(n%2==0));
//        }
//        return odd;
//     }else if(request=="even"){
//         let even =function(n){
//             console.log(n%2==0);
//         }
//         return even;
//     }else{
//         console.log("wrong request")
//     }
    

// } 
// let request="home";
// //in console type request first then set it to either odd or  even 
// and then make a variable and set it to the function then pass the request to teh function



// //METHODS
// const calculator={
//     add: function (a,b){
//         return a+b;
//     },
//     sub: function(a,b){
//         return a-b;
//     },
//     multi: function(a,b){
// //         return a*b;
//     }
// };
// //calculator
// {add: ƒ, sub: ƒ, multi: ƒ}
// calculator.add(1,2)
// 3
// calculator.sub(1,4)
// -3
//﻿
// practice question1:
// s1.Write a JavaScript function that returns array elements larger than a 
// number.
// let arr=[1,2,3,4,5,6,7,8,9,10,11,12,13];
// let num=3;
//  function number(arr,num){
//         for(let i=0;i<arr.length;i++){
//             if(arr[i]>num){
//                 console.log(arr[i]);
//             }
//         } 
// }
//  number(arr,num);
// q2 Write a Java Script function to extract 
// unique characters from a string
// .Example:str=“abcdabcdefgggh”ans=“abcdefgh”
// sol
let str="abcdabcdefgggh"
// let ans="abcdefgh"
function unique(str){
  let ans=" "
    for(let i=0;i<str.length;i++){
let currChar=str[i];
if(str.indexOf(currChar)==-1){
    ans+=currChar;
}
    }
    return ans;
}
unique(str);


//q3
// Write a JavaScript function that accepts alistofcountrynamesasinputand
// returns the longest country name as output.
 let country=["Australia","Germany","United States of America"];
 function longestName(country){
    let ansIdx=0;
    for(let i=0;i<country.length;i++){
        let ansLen=country[ansIdx].length;
        let currLen=country[i].length;
        if(currLen>ansLen){
            ansIdx=i;
        }
    }
    return country[ansIdx];
 }
 longestName(country);

//q4
// WriteaJavaScriptfunctiontocountthenumberofvowelsinaStringargumen
let str="siya";
function vowels(str){
    let count=0;
     for(let i=0;i<str.length;i++){
        if(str[i]=='a'||str[i]=='e'|| str[i]=='i'|| str[i]=='o'||str[i]=='u'){
            count++;
        }
     }
     return count;
}
vowels(str);