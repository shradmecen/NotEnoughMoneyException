1. Opis
Aplikacja symuluje konto bankowe z funkcjonalnością przelewu. 
Klasa Account umożliwia przechowywanie danych właściciela konta, numeru konta oraz salda. 
Program implementuje metodę przelewu, która sprawdza, czy na koncie znajdują się wystarczające środki. 
W przypadku próby wykonania przelewu większego niż saldo, zostaje wyrzucony wyjątek NotEnoughMoneyException.

2. Funkcjonalności
a. Tworzenie konta z danymi właściciela, numerem konta i saldem.
b. Wykonywanie przelewu, który może wyrzucić wyjątek NotEnoughMoneyException w przypadku niewystarczających środków.
c. Obsługa innych wyjątków w bloku catch.
d. Wyświetlanie aktualnego stanu konta w bloku finally po próbie przelewu.

3. Struktura
a. NotEnoughMoneyException - Klasa wyjątku, rzucana, gdy saldo na koncie jest niewystarczające do wykonania przelewu.
b. Account - Klasa reprezentująca konto, zawierająca konstruktor, gettery, settery oraz metodę do wykonania przelewu.
c. Main - Klasa zawierająca metodę main(), w której tworzony jest obiekt Account i symulowany jest przelew z błędem.