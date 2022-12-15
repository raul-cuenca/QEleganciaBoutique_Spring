create database qelegancia_boutique;
use qelegancia_boutique;

select * from producto;
insert into producto(nombre,descripcion,categoria,marca,precio,urlimagen,estado)values
('Pelota Futbol','Nro 5 - Argentina','Juguetes','Adidas',79,'https://home.ripley.com.pe/Attachment/WOP_5/2020294845987/2020294845987-1.jpg',1),
('Pelota Futbol','Nro 5 - Amarilla','Juguetes','Adidas',49,'https://home.ripley.com.pe/Attachment/WOP_5/2020294846021/2020294846021-2.jpg',1),
('Pelota Futbol','Nro 5 - Qatar','Juguetes','Adidas',69,'https://home.ripley.com.pe/Attachment/WOP_5/2020286239558/2020286239558-1.jpg',1),
('Muñeca Dolly','Rubia 25cm - Vestido Rosa','Juguetes','Dolly',59,'https://home.ripley.com.pe/Attachment/WOP_5/2032291919844/2032291919844_2.jpg',1),
('Zap Futbol Supperfly','T-39/42','Calzado','Nike',189,'https://home.ripley.com.pe/Attachment/WOP_5/2084303692818/2084303692818-1.jpg',1),
('Zap Futbol Legend','T-39/43','Calzado','Nike',249,'https://home.ripley.com.pe/Attachment/WOP_5/2084303692191/2084303692191-1.jpg',1),
('Camiseta Universitario','T-S/M/L Crema','Camisetas','Marathon',119,'https://falabella.scene7.com/is/image/FalabellaPE/19021288?wid=240&hei=240&qlt=70',1),
('Camiseta Roja','T-S/M/L','Camisetas','Adidas',129,'https://falabella.scene7.com/is/image/FalabellaPE/19013668_1?wid=240&hei=240&qlt=70',1),
('Camiseta Cristal','T-S/M/L','Camisetas','Adidas',139,'https://falabella.scene7.com/is/image/FalabellaPE/18586356_1?wid=240&hei=240&qlt=70',1),
('Camiseta Sport Boys','T-S/M/L','Camisetas','Puma',99,'https://falabella.scene7.com/is/image/FalabellaPE/18740814_1?wid=240&hei=240&qlt=70',1),
('Camiseta Peru','T-S/M/L/XL','Camisetas','Marathon',129,'https://falabella.scene7.com/is/image/FalabellaPE/17904240_2?wid=240&hei=240&qlt=70',1),
('Zap Futbol Grass','T-38/43','Calzado','Adidas',119,'https://falabella.scene7.com/is/image/FalabellaPE/18534706_2?wid=240&hei=240&qlt=70',1),
('Zap Futbol Niño','T-35/37','Calzado','Nike',129,'https://falabella.scene7.com/is/image/FalabellaPE/19064947_2?wid=240&hei=240&qlt=70',1),
('Zap Futbol Niño','T-36/39','Calzado','Adidas',139,'https://falabella.scene7.com/is/image/FalabellaPE/18999322_2?wid=240&hei=240&qlt=70',1),
('Zap Futbol Roja','T-37/42','Calzado','Puma',109,'https://falabella.scene7.com/is/image/FalabellaPE/19130208_2?wid=240&hei=240&qlt=70',1);

select * from cliente;
insert into cliente(nombre,apellido,nro_documento,telefono,direccion,urlimagen)values
('raul jose','cuenca sarrin','76762535','998982234','Av Las Praderas 763','https://creamas.org/wp-content/uploads/2017/08/foto-edi-pasaporte-carnet-.jpg'),
('andrea lisbeth','cardenas soto','33467762','998982343','Cl Las Gardenias 234','https://365enfoques.com/wp-content/uploads/2018/09/como-hacerse-uno-mismo-las-fotos-del-dni.jpg'),
('Katherine','Perez Aldana','10882367','909755364','Av Tomas Vega 2236 Int 483','https://creamas.org/wp-content/uploads/2019/07/FOTOGRAFIA-CARNET.jpg'),
('Camila','Vega Tristan','67628700','989222565','Jr Paz Soldan 7623','https://www.dzoom.org.es/wp-content/uploads/2011/09/fotos-de-carnet-paso-a-paso-en-3-minutos-734x489.jpg'),
('Soraya','Montenegro Diaz','87876547','9902764545','Las Lomas Saravay 234','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTckGospMnNwtbwS_7w9yt-Om7Fq2jVQ4eyPA&usqp=CAU'),
('Alberto','Prado Huaman','767456756','998274543','Jr Camelias 134','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnVfnhSiAEW6zHLRQukJSK8luvRRIFv3uiLtC0uGoolvm2Rzyoq78G0ADFQd4FQDuYz38&usqp=CAU'),
('Raul','Fernandez Castro','47763947','7873468','Cl Los Robles Mz F Lt 56','https://media.istockphoto.com/id/1086350530/es/foto/retrato-de-un-joven-profesional.jpg?s=612x612&w=0&k=20&c=fpQHHOLCaOWeGJt_LWkWjUnGt0gdIr9QH_gjUIg1TR0='),
('Juana','Sanchez Lopez','87644589','989872323','Jr Sopranos 299 Piso 4','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRvQ8M9AUmcxuordfWWC8f4le2qNjtHNj2ZMQ&usqp=CAU'),
('Sandra','Huancha Lara','64657333','992337865','ST 3 Grp 34 Mz B Lt 9 - VES','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_-WG1CHtvhF3RcZs0F5Y3JE1fCsDo3kjHNRLGWaSmJRRE1xNXfOYJuRgVn_8kPsxMBN8&usqp=CAU'),
('Samantha','Lopez Cerron','20983755','906657445','Las Gardenias 23','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVdfjylcV1X5nC_35H6svau1M7PigjhiMMpyzM4OB6x7aoua2yyMtKs0gPPjaobr9CYlE&usqp=CAU'),
('Pedro Saul','Anco Meza','65637847','991122213','Jr Pezeta Los Lirios 73D','https://i.pinimg.com/originals/84/b9/31/84b931bab852c7306dd31e1b5a4936d1.jpg'),
('Carlos','Gutierrez Vergara','65353664','998325576','Jr Chancay 76dB','https://media.istockphoto.com/id/916534092/es/foto/retrato-de-hombre-joven-sobre-fondo-blanco.jpg?s=612x612&w=0&k=20&c=lrgF_cewnfuCOI_R_7PUW_bAsQvF1uU682Cxs4E3XE4='),
('Juan','Valverde Espinola','43332787','922773098','Lachay 3474 Acordeno Piso 5','https://media.istockphoto.com/id/471015650/es/foto/pasaporte-retrato-de-un-hombre-sonriente-en-una-camisa-gris.jpg?s=612x612&w=0&k=20&c=gduA6z4xqUERUdn00B4j3xdMB2vbmP-ELbK4fOgBQHk=');


select * from proveedor;
insert into proveedor(nombre,ruc,telefono,direccion,urlimagen)values
('Import Salt SAC','20987367466','998927637','Jr Cusco 122 Int 403','https://www.zarla.com/images/zarla-comercial-global-1x1-2400x2400-20220413-gbcvvck84d9wkrrfcdhv.png?crop=1:1,smart&width=250&dpr=2'),
('De Todo EIRL','20364567330','981126736','Jr Abancay 344','https://www.zarla.com/images/zarla-comercial-global-1x1-2400x2400-20220413-g96ptjp3jk9wpr4dmkq7.png?crop=1:1,smart&width=250&dpr=2'),
('Loyalti Import','20983450912','7645875','Jr Andahuaylas 102','https://previews.123rf.com/images/piickz/piickz1611/piickz161100003/66143277-logo-comercial-abstracto-cesta-de-la-compra-logotipo-logotipo-de-la-tienda-en-l%C3%ADnea.jpg'),
('Importaciones Plasticas SAC','20997736645','909835512','Jr Cusco 429 Int 200','https://thumbs.dreamstime.com/z/plantilla-del-dise%C3%B1o-logotipo-de-la-tienda-amor-icono-carro-compra-135331196.jpg'),
('Import Diaz SAC','20878745666','8982388','Jr Perlas 35 Piso 7C','https://d500.epimg.net/cincodias/imagenes/2015/05/08/pyme/1431098283_691735_1431098420_noticia_normal.jpg'),
('Store MiaVela EIRL','20897653896','3674677','Las Palmas 565 Int 4','https://i.pinimg.com/736x/16/5c/90/165c9078c5099ba03ec3bec0e4518a14.jpg'),
('Cartoon Piece SAA','20911266573','7863467','Orosco Meza Int 374 - SJL','https://st3.depositphotos.com/35102928/37168/v/600/depositphotos_371684314-stock-illustration-colorful-bear-logo-suitable-for.jpg'),
('Las Salinas Store','20998738895','7883546','Lirios Mz G6 Lt 774 - LINCE','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSxZARNBmSsKCPpDXfjR7VPsFiXD9HgjGWyThOKQjny_u_gNt9LPiANLlLlAy5Xjo0Y0Og&usqp=CAU'),
('Importaciones Garay EIRL','20332345465','998934655','Av Abancay 644 Int 45','https://api.izeelogo.com/categoriepage/logo/crear-logos-empresariales/disenos-de-logos-de-empresas-de-tecnologia.png');