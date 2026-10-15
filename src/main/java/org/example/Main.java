import org.example.Cerchio;
import org.example.Forma;
import org.example.Rettangolo;
import org.example.Triangolo;

import static java.lang.IO.println;

void main() {
    Forma[] forme = {new Cerchio(2), new Rettangolo(3, 4), new Triangolo(6, 5)};

    double totale = 0;
    Forma max = forme[0];
    for(Forma f : forme){
        println(f);
        totale += f.Area();
        if(f.Area() > max.Area()){
            max = f;
        }
    }
    println("Area totale = " + Math.round(totale * 100) / 100.0);
    if(max instanceof Triangolo t) {
        println("La più grande è un triangolo di base " + t.Base);
    }
}