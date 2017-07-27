var circle = {
    print: function () { return console.log('circle'); }
};
var employee = {
    print: function () { return console.log('employee'); }
};
function PrintAll(c, e) {
    c.print();
    e.print();
}
PrintAll(circle, employee);
