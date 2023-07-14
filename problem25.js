//25. Write a Javascript program to display the status (I.e. display book name, author name & reading status) of books.
//You are given an object library in the code's template. It contains a list of books with the above mentioned properties
//Your task is to display the following:

var library = [
    {
        title: 'Bill Gates',
        author: 'The Road Ahead',
        readingStatus: true
    },
    {
        title: 'Steve Jobs',
        author: 'Walter Isaacson',
        readingStatus: true
    },
    {
        title: 'Mockingjay: The Final Book of The Hunger Games',
        author: 'Suzanne Collins',
        readingStatus: false
    }
];

for(let i=0;i<library.length;i++)
{
   
if(library[i].readingStatus)
{
    console.log("You Still Need To Read "+library[i].title +"by"+library[i].author);
}
else
{
    console.log("Already Read "+library[i].title +"by"+library[i].author);
}
console.log();
}
