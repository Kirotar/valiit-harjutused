function showmessage() {
    alert("Hi");
}

function multiplicationTable() {


//Multiplication table
    let num = parseInt(prompt("Enter a number: "));
    for (let i = 0; i <= 10; i++) {
        console.log(num + " multiplied by " + i + " is " + (num * i));
        console.log(`${num} x ${i} = ${num * i}`);
    }
}

function calculate() {
    let num = parseInt(prompt("Enter a number: "));
    let num2 = parseInt(prompt("Enter another number: "));
    console.log(num + num2);
    console.log(num * num2);
    console.log(num - num2);
    console.log(num / num2);
}

function toDoList() {
    let taskArray = [];
    let i = true;
    while (i) {
        let action = prompt("What do you wish to do?").toUpperCase();
                switch (action) {
            case "ADD":
                let addedTask = prompt("Add a task");
                taskArray.push(addedTask);
                console.log("Task added.");
                break;
            case "VIEW":
                if (taskArray.length === 0) {
                    console.log("No tasks yet!")}
                console.log("Your tasks: " + taskArray)
                break;
            case "EXIT":
                console.log("Thank you for using the application!")
                i = false;
                break;
                    default:
                        i = false;
                        break;
        }
    }
}
