function predict() {
    let exp = Number(document.getElementById("exp").value);
    let salary;

    if (exp <= 1)
        salary = 25000;
    else if (exp <= 3)
        salary = 40000;
    else if (exp <= 5)
        salary = 60000;
    else
        salary = 80000;

    document.getElementById("result").innerHTML =
        "Salary: ₹" + salary;
}