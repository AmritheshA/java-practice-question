//26. Given a variable named my_string, try reversing the string using  my_string.split().reverse().join() 
//and then print the reversed string to the console. If the try clause has an error, print the error message to the 
//console. Finally, print the typeof of the my_string variable to the console.


const prompt = require('prompt-sync')();


let str = prompt('What is your name?');


function isNumber(strs) {
    if (typeof strs === "string") {
        return !isNaN(strs);
    }
}


try {


    if (isNumber(str)) {
        throw ("Error : my_string.split is not a function")
    } else {
        console.log("Reversed String Is :" + str.split("").reverse().join(""));
    }


} catch (err) {
    console.log(err);
}
finally {
    if (isNumber(str)) {
        console.log("Type Of My_string :" + typeof (Number(str)));
    } else {
        console.log("Type Of My_string :" + typeof (str));
    }


}
