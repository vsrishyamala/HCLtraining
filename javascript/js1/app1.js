var x = 0;
var array = Array();

function addEvent()
{
 array[x] = document.getElementById("text1").value;
 x++;

}

function displayEvent()
{
   var e = " ";   
    
   for (var y=0; y<array.length; y++)
   {
     e += "Element " + y + " = " + array[y] + "<br/>";
   }
   document.getElementById("result").innerHTML = e;
}