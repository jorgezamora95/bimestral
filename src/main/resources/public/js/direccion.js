//Vamos hacer el request a nuestro servicio usando ajax con jquery

$("#guardarDireccion").click(function(){
        //Aplicamos el metodo post usando la uri del servicio
        $.post("direccion/12/calle 13/55130/Ecatepunk",function(json) {
console.log(json.id);
    
            }) ;
       });
