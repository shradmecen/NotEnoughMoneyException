Opis:
- Aplikacja symuluje konto bankowe z funkcjonalnością przelewu. 
- Klasa Account umożliwia przechowywanie danych właściciela konta, numeru konta oraz salda. 
- Program implementuje metodę przelewu, która sprawdza, czy na koncie znajdują się wystarczające środki. 
- W przypadku próby wykonania przelewu większego niż saldo, zostaje wyrzucony wyjątek NotEnoughMoneyException.

Funkcjonalności:
- Tworzenie konta z danymi właściciela, numerem konta i saldem.
- Wykonywanie przelewu, który może wyrzucić wyjątek NotEnoughMoneyException w przypadku niewystarczających środków.
- Obsługa innych wyjątków w bloku catch.
- Wyświetlanie aktualnego stanu konta w bloku finally po próbie przelewu.

Struktura:
1. NotEnoughMoneyException
- Klasa wyjątku, rzucana, gdy saldo na koncie jest niewystarczające do wykonania przelewu.
3. Account
- Klasa reprezentująca konto, zawierająca konstruktor, gettery, settery oraz metodę do wykonania przelewu.
4. Main
- Klasa zawierająca metodę main(), w której tworzony jest obiekt Account i symulowany jest przelew z błędem.
