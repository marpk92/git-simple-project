Te zadania mają na celu przećwiczenie przykładowej ścieżki w pracy przy wdrożeniu zmiany do kodu. Podzielcie się zadaniami
tak aby jedna osoba wykonała jedno zadanie. Gdyby jakieś zadanie było niejasne zacomitujcie zmiany jak najprostsze, w tym ćwiczeniu
głównym celem jest przećwiczenie funkcji gita.

Przed wykonaniem zadania utwórz branch na podstawie branchu Twojego zespołu.

Zadania do zrobienia:

1. Potrzebujemy wiedzieć jakim podatkiem vat są obłożone sprzedawane produkty.
Dodaj pole 'vat' do klasy Product, które będzie przechowywało wartość procentową podatku.
Dodaje metodą, która wyliczy wartość podatku z ceny i zaktualizuj konstruktor tej klasy. 
(Na potrzeby tego ćwiczenia możesz ustawić stałą wartość w konstruktorze dla dodanego pola)
2. W sklepie oprócz produktów można kupić też usługi. W tym celu dodaj nową klasę Service. Jak narazie klasa Service
będzie miała takie same pola jak klasa Product, ale w przyszłości może się to zmienić i dlatego potrzebujemy nowej klasy dla usług.
Do klasy ShoppingCart oprócz listy produktów należy też dodać pole z listą usług.
3. W sklepie chcemy przypisywać koszyk zakupów do konkretnego klienta. Do klasy Customer dodaj pole koszyka
i w klasie Main po zaincjazlizowaniu koszyka utwórz nowy obiekt Customer i przypisz do niego koszyk. 
Klasa Customer powinna także potrafić wyświetlić koszyk klienta.
4. W sklepie mogą być też urządzane promocje. Dodaj klasę z informacją o zniżce. Polami tej klasy powinny być produkt
i wartość zniżki.

Po wykonaniu zadania utwórz commit, wypchnij zmiany do repozytorium zdalnego i wystaw Pull request w github.
Po utworzeniu pull requestu, umówcie się kto zrobi code review danej zmiany i zmerguje kod. Chodzi o to aby osoba,
która utworzy pull request nie mergowała swojego pull requestu.
Po ostatnim mergu sciągnijcie zmiany i sprawdźcie historię zmian brancha zespołowego.