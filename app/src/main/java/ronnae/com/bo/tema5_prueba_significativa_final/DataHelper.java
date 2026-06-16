package ronnae.com.bo.tema5_prueba_significativa_final;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {

    public static List<ItemModel> getMythologicalCreatures() {
        List<ItemModel> list = new ArrayList<>();

        list.add(new ItemModel(1, "Pegaso", "Griega", "Aire", 
                "Espectacular caballo alado que nació de la sangre derramada por Medusa al ser decapitada por Perseo. Simboliza la inspiración poética y la libertad del espíritu.", 
                R.drawable.ic_element_sky, "8.5/10", "Cumbres del Olimpo", "Rayos de Zeus"));

        list.add(new ItemModel(2, "Fénix", "Griega", "Fuego", 
                "Ave majestuosa de plumaje rojo y dorado que vive siglos antes de consumirse en su propio fuego y renacer gloriosamente de sus cenizas. Representa la resiliencia eterna.", 
                R.drawable.ic_element_fire, "9.0/10", "Volcanes Celestiales", "Agua Sagrada"));

        list.add(new ItemModel(3, "Dragón Oriental", "Oriental", "Agua", 
                "Criatura serpentina benevolente y majestuosa que controla las lluvias, los ríos y los océanos. Trae fortuna, sabiduría y abundancia a quienes lo respetan.", 
                R.drawable.ic_element_water, "9.8/10", "Palacios del Fondo del Mar", "Sequía Absoluta"));

        list.add(new ItemModel(4, "Grifo", "Griega", "Aire", 
                "Criatura híbrida con cuerpo de león y cabeza y alas de águila. Es conocido como el guardián eterno de los tesoros y el protector contra las fuerzas del mal.", 
                R.drawable.ic_element_sky, "8.0/10", "Nidos en Montañas Altas", "Flechas Envenenadas"));

        list.add(new ItemModel(5, "Minotauro", "Griega", "Tierra", 
                "Monstruo con cuerpo de hombre y cabeza de toro, encerrado en el impenetrable Laberinto de Creta construido por Dédalo. Se alimenta de sacrificios humanos.", 
                R.drawable.ic_element_earth, "8.7/10", "Laberinto de Creta", "Astucia y Espada de Teseo"));

        list.add(new ItemModel(6, "Centauro", "Griega", "Bosque", 
                "Ser con torso humano y cuerpo de caballo. Habita en los bosques montañosos y es famoso por su habilidad con el arco, su naturaleza salvaje y sus conocimientos medicinales.", 
                R.drawable.ic_element_forest, "7.5/10", "Bosques de Tesalia", "Flechas de Hércules"));

        list.add(new ItemModel(7, "Sirena", "Europea", "Agua", 
                "Criatura marina mitad mujer y mitad pez. Su canto es tan bello e hipnótico que atrae irresistiblemente a los marineros para hacerlos naufragar en los arrecifes.", 
                R.drawable.ic_element_water, "7.2/10", "Arrecifes y Mares Profundos", "Cera en los Oídos / Ruido Fuerte"));

        list.add(new ItemModel(8, "Quimera", "Griega", "Fuego", 
                "Híbrido monstruoso con cabeza de león, cuerpo de cabra y cola de serpiente que exhala llamaradas devastadoras. Sembró el terror hasta ser derrotada por Belerofonte.", 
                R.drawable.ic_element_fire, "8.9/10", "Cavernas de Licia", "Lanza con punta de Plomo"));

        list.add(new ItemModel(9, "Esfinge", "Egipcia", "Divino", 
                "Enigmático ser con cuerpo de león y rostro humano. Custodia templos sagrados y desafía a los viajeros con acertijos complejos; devora a quienes fallan.", 
                R.drawable.ic_element_divine, "9.2/10", "Desiertos de Guiza", "Acertijos resueltos / Intelecto"));

        list.add(new ItemModel(10, "Cerbero", "Griega", "Sombras", 
                "Temible perro de tres cabezas y cola de serpiente que vigila la entrada al Inframundo, permitiendo entrar a las almas pero devorando a quienes intentan escapar.", 
                R.drawable.ic_element_shadow, "9.4/10", "Puertas del Inframundo", "Música de Lira (Orfeo) / Fuerza"));

        list.add(new ItemModel(11, "Hidra de Lerna", "Griega", "Bosque", 
                "Monstruo acuático serpentino con múltiples cabezas. Si se le corta una cabeza, le crecen dos en su lugar, y su sangre es un veneno mortal.", 
                R.drawable.ic_element_forest, "9.1/10", "Pantanos de Lerna", "Fuego (Cauterizar los cuellos)"));

        list.add(new ItemModel(12, "Kraken", "Nórdica", "Agua", 
                "Colosal criatura marina con forma de calamar gigante que acecha en las profundidades del océano. Sus enormes tentáculos pueden arrastrar barcos enteros al abismo.", 
                R.drawable.ic_element_water, "9.9/10", "Fosas Abisales del Norte", "Arpones de Acero y Tormentas"));

        list.add(new ItemModel(13, "Basilisco", "Europea", "Sombras", 
                "El rey de las serpientes, una criatura de pequeño tamaño pero mortal que puede petrificar o matar con una sola mirada directa y marchitar la tierra al pasar.", 
                R.drawable.ic_element_shadow, "8.6/10", "Catacumbas y Ruinas", "Canto de Gallo / Su propio reflejo"));

        list.add(new ItemModel(14, "Unicornio", "Europea", "Magia", 
                "Caballo blanco místico con un único cuerno espiral en su frente. Su cuerno posee propiedades mágicas purificadoras capaces de neutralizar cualquier veneno.", 
                R.drawable.ic_element_magic, "8.0/10", "Bosques Encantados", "Doncellas de Corazón Puro"));

        list.add(new ItemModel(15, "Valquiria", "Nórdica", "Divino", 
                "Doncella guerrera al servicio de Odín que cabalga sobre caballos alados por el campo de batalla, eligiendo a los guerreros más valientes caídos para el Valhalla.", 
                R.drawable.ic_element_divine, "9.0/10", "Salones del Valhalla", "Armas Rúnicas"));

        list.add(new ItemModel(16, "Banshee", "Irlandesa", "Sombras", 
                "Espíritu femenino del folklore celta que aparece cerca de los hogares para anunciar la muerte inminente de un miembro de la familia con sus gritos y lamentos.", 
                R.drawable.ic_element_shadow, "7.0/10", "Colinas de Irlanda", "Hierro Frío"));

        list.add(new ItemModel(17, "Golem de Praga", "Hebrea", "Tierra", 
                "Gigante de barro traído a la vida mediante rituales cabalísticos e inscribiendo palabras sagradas en su frente. Sirve como defensor incansable de los oprimidos.", 
                R.drawable.ic_element_earth, "8.8/10", "Sinagogas y Subterráneos", "Borrar la inscripción de su frente"));

        list.add(new ItemModel(18, "Pájaro Trueno", "Nativa Americana", "Aire", 
                "Ave inmensa de gran poder espiritual que genera truenos al batir sus alas y relámpagos al parpadear. Es visto como un guardián de la naturaleza.", 
                R.drawable.ic_element_sky, "9.3/10", "Nubes de Tormenta", "Flechas de Cobre y Granizo"));

        list.add(new ItemModel(19, "Kitsune", "Japonesa", "Magia", 
                "Zorro espiritual con múltiples colas (hasta nueve). Posee una gran inteligencia, poderes metamórficos para transformarse en humanos y control del fuego azul.", 
                R.drawable.ic_element_magic, "8.9/10", "Templos Shinto", "Perros Sagrados y Espejos Reveladores"));

        list.add(new ItemModel(20, "Tengu", "Japonesa", "Aire", 
                "Espíritu de las montañas con cara roja y nariz larga, o pico de ave. Son maestros de las artes marciales, la estrategia y controladores del viento.", 
                R.drawable.ic_element_sky, "8.3/10", "Montañas Sagradas de Japón", "Encantamientos Budistas"));

        list.add(new ItemModel(21, "Oni", "Japonesa", "Tierra", 
                "Demonio robusto de cuernos afilados y piel de colores vivos que porta una enorme maza de hierro llamada Kanabo. Representa la fuerza brutal y el castigo.", 
                R.drawable.ic_element_earth, "8.2/10", "Puertas del Infierno (Jigoku)", "Semillas de Soja bendecidas"));

        list.add(new ItemModel(22, "Wendigo", "Algonquina", "Sombras", 
                "Espíritu malévolo del invierno y el hambre caníbal que posee a los humanos que consumen carne humana, transformándolos en monstruos famélicos e insaciables.", 
                R.drawable.ic_element_shadow, "8.4/10", "Bosques Gélidos del Norte", "Fuego y Destrucción del Corazón de Hielo"));

        list.add(new ItemModel(23, "Chupacabras", "Latinoamericana", "Sombras", 
                "Bestia críptida con ojos rojos brillantes y espinas en su lomo. Es temido por atacar animales domésticos y succionarles la sangre en las zonas rurales.", 
                R.drawable.ic_element_shadow, "6.5/10", "Campos y Granjas", "Luz Brillante y Jaulas de Acero"));

        list.add(new ItemModel(24, "Yeti", "Himalaya", "Tierra", 
                "El abominable hombre de las nieves. Criatura simiesca gigante cubierta de pelo blanco que habita en las cumbres nevadas del Tíbet y evade el contacto humano.", 
                R.drawable.ic_element_earth, "7.8/10", "Picos Nevados del Himalaya", "Calor Extremo y Fuego"));

        list.add(new ItemModel(25, "Pie Grande", "Norteamericana", "Bosque", 
                "Gigante esquivo cubierto de espeso pelaje que deambula por los bosques profundos. Deja huellas masivas y es el centro de innumerables leyendas forestales.", 
                R.drawable.ic_element_forest, "7.2/10", "Bosques del Noroeste", "Detección Tecnológica / Trampas"));

        list.add(new ItemModel(26, "Leprechaun", "Irlandesa", "Magia", 
                "Pequeño duende zapatero de la mitología irlandesa. Es muy travieso y esconde su olla de monedas de oro al final del arcoíris, otorgando tres deseos a quien lo capture.", 
                R.drawable.ic_element_magic, "6.0/10", "Campos de Tréboles", "Ser distraído por halagos"));

        list.add(new ItemModel(27, "Arpía", "Griega", "Aire", 
                "Monstruo alado con rostro de mujer y cuerpo de ave de rapiña. Roban la comida de las personas y propagan la pestilencia a donde quiera que van.", 
                R.drawable.ic_element_sky, "7.0/10", "Islas del Mar Egeo", "Sonido de Campanas de Bronce"));

        list.add(new ItemModel(28, "Cíclope", "Griega", "Tierra", 
                "Gigante de un solo ojo circular en su frente. Poseen una fuerza colosal y son herreros legendarios que forjaron el tridente de Poseidón y los rayos de Zeus.", 
                R.drawable.ic_element_earth, "8.6/10", "Cuevas y Volcanes", "Ceguera de su único ojo"));

        list.add(new ItemModel(29, "Gorgona", "Griega", "Sombras", 
                "Monstruo femenino con colmillos y cabellos formados por serpientes vivas. Cualquier ser que la mire directamente a los ojos queda petrificado al instante.", 
                R.drawable.ic_element_shadow, "9.2/10", "Templos en Ruinas", "Superficies Reflectantes (Espejos)"));

        list.add(new ItemModel(30, "Sátiro", "Griega", "Bosque", 
                "Espíritu alegre de la naturaleza con cuerpo humano y piernas de cabra. Pasa su tiempo tocando la flauta de pan, bailando y acompañando al dios del vino.", 
                R.drawable.ic_element_forest, "6.8/10", "Arboledas Sagradas", "Música de flauta rival"));

        list.add(new ItemModel(31, "Wyvern", "Europea", "Aire", 
                "Dragón heráldico de dos patas con alas de murciélago y una cola terminada en un aguijón venenoso similar al de un escorpión. Es sumamente agresivo.", 
                R.drawable.ic_element_sky, "8.4/10", "Cañones y Acantilados", "Ataques de Rayo y Frío"));

        list.add(new ItemModel(32, "Leviatán", "Hebrea", "Agua", 
                "Bestia colosal de los mares que representa el caos primitivo. Sus escamas son impenetrables y su aliento puede hacer hervir las aguas a su alrededor.", 
                R.drawable.ic_element_water, "9.9/10", "Abismos Marinos", "Arpones Sagrados"));

        list.add(new ItemModel(33, "Behemot", "Hebrea", "Tierra", 
                "Inconquistable monstruo terrestre de tamaño monumental. Personifica la fuerza implacable de la tierra y habita en los desiertos orientales invisibles.", 
                R.drawable.ic_element_earth, "9.8/10", "Desiertos Orientales", "Espada del Creador"));

        list.add(new ItemModel(34, "Fenrir", "Nórdica", "Sombras", 
                "Lobo gigante de fuerza monstruosa y voracidad sin límites. Está destinado a romper sus cadenas mágicas y devorar a Odín durante el Ragnarok.", 
                R.drawable.ic_element_shadow, "9.7/10", "Tierras Gélidas del Norte", "Cadenas mágicas Gleipnir"));

        list.add(new ItemModel(35, "Sleipnir", "Nórdica", "Divino", 
                "El caballo de ocho patas perteneciente a Odín. Es el corcel más veloz de la creación, capaz de viajar entre el reino de los vivos y el de los muertos.", 
                R.drawable.ic_element_divine, "8.8/10", "Asgard", "Rutas Bloqueadas Mágicamente"));

        list.add(new ItemModel(36, "Jórmundgander", "Nórdica", "Agua", 
                "La serpiente del mundo que yace en el fondo del océano. Es tan colosal que rodea toda la tierra de Midgard mordiendo el extremo de su propia cola.", 
                R.drawable.ic_element_water, "9.9/10", "Fondo del Océano de Midgard", "Martillo Mjölnir de Thor"));

        list.add(new ItemModel(37, "Níðhöggr", "Nórdica", "Sombras", 
                "Pavoroso dragón negro que habita en el Niflheim. Pasa la eternidad royendo las raíces del Yggdrasil, el árbol de la vida, para desestabilizar el cosmos.", 
                R.drawable.ic_element_shadow, "9.5/10", "Niflheim (Inframundo Nórdico)", "Luz Sagrada de los Elfos"));

        list.add(new ItemModel(38, "Ammit", "Egipcia", "Sombras", 
                "Monstruo híbrido con cabeza de cocodrilo, patas de león e hipopótamo. Devora los corazones de los muertos que no pasan el juicio de Osiris.", 
                R.drawable.ic_element_shadow, "9.0/10", "Sala de las Dos Verdades", "Corazón Puro y Justificado"));

        list.add(new ItemModel(39, "Roc", "Árabe", "Aire", 
                "Ave gigantesca de rapiña descrita en las leyendas de Simbad el Marino. Es tan grande y fuerte que puede levantar elefantes enteros con sus garras.", 
                R.drawable.ic_element_sky, "8.9/10", "Islas Lejanas y Cielos", "Lanzas de Asedio"));

        list.add(new ItemModel(40, "Ghul", "Árabe", "Sombras", 
                "Espíritu necrófago y demonio del desierto que se disfraza con formas humanas. Habita en cementerios para saquear tumbas y devorar carne humana.", 
                R.drawable.ic_element_shadow, "7.4/10", "Cementerios y Ruinas del Desierto", "Exorcismo y Fuego"));

        list.add(new ItemModel(41, "Djinn", "Árabe", "Magia", 
                "Genios nacidos de fuego sin humo. Tienen libre albedrío y poderes inmensos para alterar la realidad y conceder deseos a quienes los confinan.", 
                R.drawable.ic_element_magic, "9.4/10", "Lámparas y Vasijas Selladas", "Sellos de Salomón"));

        list.add(new ItemModel(42, "Mantícora", "Persa", "Fuego", 
                "Bestia con cuerpo de león rojo, rostro humano y cola de escorpión capaz de lanzar púas venenosas. Su mordedura es instantáneamente letal.", 
                R.drawable.ic_element_fire, "8.8/10", "Selvas de Persia", "Escudos de Metal Grueso"));

        list.add(new ItemModel(43, "Qilin", "China", "Divino", 
                "Criatura cornuda benevolente que aparece ante la llegada de sabios o gobernantes ilustres. Camina sobre el agua y no daña ni una brizna de hierba.", 
                R.drawable.ic_element_divine, "8.7/10", "Valles Celestiales", "Energía Negativa o Maldad"));

        list.add(new ItemModel(44, "Nian", "China", "Fuego", 
                "Bestia depredadora que emerge de las profundidades para aterrorizar aldeas. Teme el color rojo brillante, las luces de bengala y los ruidos fuertes.", 
                R.drawable.ic_element_fire, "8.0/10", "Montañas Orientales", "Ruidos Fuertes y Color Rojo"));

        list.add(new ItemModel(45, "Kappa", "Japonesa", "Agua", 
                "Espíritu acuático con caparazón de tortuga. Lleva agua en una cavidad sobre su cabeza; si esta cavidad se seca, pierde toda su fuerza mágica.", 
                R.drawable.ic_element_water, "7.0/10", "Ríos de Japón", "Hacerle una reverencia (vuelca el agua)"));

        list.add(new ItemModel(46, "Tanuki", "Japonesa", "Bosque", 
                "Perro mapache travieso con poderes metamórficos para transformarse en objetos y humanos. Le encanta burlarse de la gente y disfrutar del sake.", 
                R.drawable.ic_element_forest, "6.5/10", "Bosques y Templos Shinto", "Descubrir su verdadera cola"));

        list.add(new ItemModel(47, "Kelpie", "Escocesa", "Agua", 
                "Espíritu acuático demoníaco capaz de tomar la forma de un caballo manso. Invita a los viajeros a montarlo para luego arrojarlos al río y ahogarlos.", 
                R.drawable.ic_element_water, "7.4/10", "Lagos de Escocia", "Brida de Hierro"));

        list.add(new ItemModel(48, "Selkie", "Escocesa", "Agua", 
                "Criaturas marinas capaces de mudar su piel de foca para caminar en tierra firme como humanos hermosos. Si pierden su piel, no pueden regresar al mar.", 
                R.drawable.ic_element_water, "6.8/10", "Costas de las Islas Orcadas", "Robar y ocultar su piel de foca"));

        list.add(new ItemModel(49, "Dríade", "Griega", "Bosque", 
                "Ninfas de los árboles asociadas a los robles. Su vida está unida al destino del árbol que habitan; si el árbol muere, la dríade perece con él.", 
                R.drawable.ic_element_forest, "6.2/10", "Bosques Antiguos", "Fuego y Hachas"));

        list.add(new ItemModel(50, "Ogro", "Europea", "Tierra", 
                "Monstruoso gigante de gran fuerza física pero escasa inteligencia. Tienen un hambre insaciable de carne humana y son temidos en las leyendas rústicas.", 
                R.drawable.ic_element_earth, "7.0/10", "Pantanos y Cuevas Oscuras", "Trampas de foso / Engaños"));

        list.add(new ItemModel(51, "Pixie", "Celta", "Magia", 
                "Diminutas hadas juguetonas de orejas puntiagudas. Les encanta desviar a los viajeros de sus caminos y esconder objetos pequeños en las casas.", 
                R.drawable.ic_element_magic, "5.8/10", "Páramos y Círculos de Piedra", "Pan bendito / Sal"));

        list.add(new ItemModel(52, "Valquiria de Fuego", "Nórdica", "Fuego", 
                "Facción de guerreras aladas envueltas en fuego divino que patrullan los cielos ardientes del Ragnarok, empuñando espadas de plasma místico.", 
                R.drawable.ic_element_fire, "9.2/10", "Muspelheim", "Hielo Ancestral"));

        list.add(new ItemModel(53, "Baku", "Japonesa", "Magia", 
                "Espíritu con cuerpo de oso, trompa de elefante y garras de tigre. Es convocado por la noche para devorar las pesadillas y traer buen augurio.", 
                R.drawable.ic_element_magic, "8.0/10", "Reino de los Sueños", "Ofrendas Impuras"));

        return list;
    }
}
