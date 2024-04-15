package com.dam.refactor;

public class Main {
    /* Método para devolver la puntuacion de tenis */
    public static String getScore(int puntuacionJugador1, int puntuacionJugador2) {
        String puntuacion = "";

        /* Compara puntuaciones en los casos de empate a puntos*/
        if (puntuacionJugador1 == puntuacionJugador2) {
            switch (puntuacionJugador1)
            {
                case 0:
                    puntuacion = "Love-All";
                    break;
                case 1:
                    puntuacion = "Fifteen-All";
                    break;
                case 2:
                    puntuacion = "Thirty-All";
                    break;
                case 3:
                    puntuacion = "Forty-All";
                    break;
                default:
                    puntuacion = "Deuce";
                    break;

            }
        }

        /* Compara puntuaciones en los casos de ventaja o ganar set*/
        else if (puntuacionJugador1 >=4 || puntuacionJugador2 >=4)
        {
            int diferenciaPuntos = puntuacionJugador1-puntuacionJugador2;
            if (diferenciaPuntos==1) puntuacion ="Advantage player1";
            else if (diferenciaPuntos ==-1) puntuacion ="Advantage player2";
            else if (diferenciaPuntos>=2) puntuacion = "Win for player1";
            else puntuacion ="Win for player2";
        }

        /* Compara puntuaciones en los casos de puntuaciones distintas a empate o ventaja*/
        else
        {
            int puntuacionTemporal = 0;
            for (int i=1; i<3; i++)
            {
                if (i==1) puntuacionTemporal = puntuacionJugador1;
                else { puntuacion+="-"; puntuacionTemporal = puntuacionJugador2;
                }
                switch(puntuacionTemporal)
                {
                    case 0:
                        puntuacion+="Love";
                        break;
                    case 1:
                        puntuacion+="Fifteen";
                        break;
                    case 2:
                        puntuacion+="Thirty";
                        break;
                    case 3:
                        puntuacion+="Forty";
                        break;
                }
            }

        }
    return puntuacion; // Devuelve la puntuacion
    }
}