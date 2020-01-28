SPECIFIKACIJA

Kratak opis:
	Program koji omogucava serviseru da unese sve potrebne podatke o vozilu koje 	je potrebno servisirati i jasno vidi sva vozila koja su zakazana za servis.


PRVI DEO (Forma «Prijem novog vozila u servis»)

1. U servis automobila je moguce uvesti 2 tipa vozila: 
	- Audi
	- VW

2. Model auta mora odgovorati marki izabranog vozila.

3. Marke automobila su proizvoljno unete iz baze.

4. U slucaju promene marke vozila, slika iznad mora se istovremeno menjati u skladu sa izabranom markom vozila.

5. Vreme prijema mora biti u formatu: HH: MM (24h format - od 09h do 16h).

6. Datum prijema mora biti u formatu: dd.MM.yyyy.

7. U slucaju smanjivanja forme (njene sirine i/ili duzine), u svakom trenutku mora biti vidljiv scrollbar (vertikalni i horizontalni) koji omogucava da sva polja na formi budu vidljiva.

8. Minimalni datum koji se moze izabrati je danasnji datum (datum pokretanja programa).

9. Uslov (datum i vreme): U slucaju biranja danasnjeg datuma (datuma pokretanja programa), mora se proveriti vreme. Izabrano vreme mora biti nakon trenutnog vremena pokretanja forme.

10. Obaveza polja: 
	a) «Marka vozila», 
	b) «Model vozila»,
	c) «Vreme prijema»,
	d) «Datum prijema»

11. U slucaju da su svi kriterijumi ispunjeni, klikom na dugme «Potvrdi», pojavljuje se opcija koja omogucava serviseru da jos jednom proveri osnovne podatke vozila ili nastavi dalje sa obradom vozila (u kom slucaju se pored slike marke vozila mora pojaviti tekst izabranog vozila ($MARKA$ $MODEL$)) i sva prethodno popunjena polja se vise ne mogu menjati.


DRUGI DEO (Forma «Prijem novog vozila u servis»)


12. Uslovi (polja):
	
 	a) «Kilometraza» - max. broj je 999.999; min. broj je 1.000; unos specijalnih 	karaktera i slova je zabranjen; 	slider se takodje moze koristiti cijem se promenom za svaki tzv. step kilometraza menja za 1.000 (min. step 0; 	    	    max. step 200.000),
	
   	b) «Broj sasije» - mora sadrzati tacno 7 cifara; unos brojeva i slova je dozvoljen; 	unos specijalnih karaktera 	   je zabranjen; nakon sto se svako slovo ispise ono se mora konvertovati u veliko slovo tzv. u uppercase,
	
	c) «Registarka oznaka» - mora biti u formatu:
	$SLOVOSLOVO$-$BROJBROJBROJ$-$SLOVOSLOVO$; nakon klika van ovog 	polja, cela registarska oznaka se mora konvertovati 	    u veliko slovo tzv. u uppercase,
	
 	d) «Redovne servisne usluge»: obuhvataju 3 servisa («Servis zamene ulja», 	«Inspekcijski servis», «Veliki 		servis»); prelazak misem preko odgovajuce 	checkbox opcije mora prikazati tekst (vise informacija o datom 		servisu) koji mora 	biti obradjen u HTML-u; mora se izabrati jedan servis i to: ili samo «Veliki 	servis» ili 	    «Servis zamene ulja» i/ili «Inspekcijski servis»,
	
 	e) «Dodatne servisne usluge» - obuhvacene u listi koja je sakrivena iza dugmeta 	«Otvori listu», cijim se 	klikom otvara ista; ta lista obuhvata sledece dodatne 	servisne usluge: «Zamena kocione tecnosti», «Zamena 	           pneumatika», «Kontrola 	rada 	motora», «Centriranje trapa», «Provera akumulatora», «Popravka 	karoserije»; moze 	se izabrati vise ovih usluga ili pak nijedna,
	
 	f) «Dodatne napomene» - max. broj karaktera u ovom polju je 160; ovo polje 	mora 	takodje sadrzati tzv. 		placeholder tekst «Napomene za servisere»; 	napomene se mogu navesti ili ne moraju; ukoliko ima napomena, onda 	   se gore navedeni placeholder ne sme videti.

13. U slucaju da su svi uslovi za polja u celosti ispunjeni, klikom na dugme «Potvrdi», pojavljuje se info. poruka da je vozilo uspesno uneto u bazu vozila i ta ista poruka mora automatski nestati nakon tacno 3 sekunde. Dalje se moze nastaviti sa unosom novog vozila ili zatvoriti prozor. U slucaju pojavljivanja ma kakve greske, unos vozila u bazu mora biti onemogucen i svaka greska mora biti jasno prikazana.

TRECI DEO (Forma «Sva vozila»)

1. Sva vozila koja se trenutno nalaze u bazi moraju biti prikazana preko tabele koja sadrzi sledece kolone: «Redni broj», «ID», «Marka vozila», «Model vozila», «Vreme», «Datum», «Kilometraza», «Broj sasije», «Registarska oznaka», «Rednovne servisne usluge», «Dodatne servisne usluge», «Napomene».

2. Uslovi (kolone):
	a) «Redni broj» - mora poceti od broja 1 i raste za sledeci naredni broj sa svakim 	novim vozilom unetom u bazu,
	b) «ID» - se odnosi na ID iz MySQL-a i ne mora se nuzno poklapati sa rednim 	brojem vozila (ovaj ID se koristi za brisanje vozila),
	c) «Marka vozila» - prikazuje izabranu marku vozila,
	d) «Model vozila» - sadrzi izabrani model vozila koji mora odgovorati marki 	vozila,
	e) «Vreme» - sadrzi izabrano vreme i mora biti u formatu: HH: MM (24h format - 	od 09h do 16h),
	f) «Datum» - sadrzi izabrani datum i mora biti u formatu: dd.MM.yyyy ,
	g) «Kilometraza» - sadrzi izabranu kilometrazu,
	h) «Broj sasije» - sadrzi izabrani broj sasije,
	i) «Registarska oznaka» - sadrzi izabranu registarsku oznaku,
	j) «Redovne servisne usluge» - sadrzi tekst o redovnoj izbranoj/izabranim 	servisnoj uslugi/servisnim uslugama,
	k) «Dodatne servisne usluge» - sadrzi tekst o dodatnoj izbranoj/izabranim 	servisnoj uslugi/servisnim uslugama ili znak «/» u slucaju da nema dodatne 	servisne usluge,
	l) «Napomene» - sadrzi tekst o napomenama ili znak «/» u slucaju da nema 	napomena.

3. Detalji o tabeli: svaki put kada tabela dobije fokus ona se mora obnoviti u smislu da uvek prikazuje sveze podatke o vozilima koji se trenutno nalaze u bazi; sortiranje svake kolone mora biti moguce; pomeranje kolona mora biti moguce; samo jedan red u jednom trenutku moze biti selektovan.

4. Ispod tabele mora se u svakom trenutku prikazati trenutni broj vozila ili tekst: «Trenutno nema vozila u bazi!» u slucaju da nema nijednog vozila u bazi.

5. Mora biti moguce pretrazivanje po bilo kojoj koloni iz tabele; polje «pretrazi» mora sadrzati tzv. placeholder tekst «Pretrazi po bilo kom kriterijumu»; placeholder mora nestati u slucaju unosa teksta u ovo polje i takodje se odmah pored mora pojaviti informacija o broju nadjenih rezultata sa tekstom: «Broj nadjenih rezultata:» $BROJNADJENIHREZULTATA$ ili tekst: «Nema nadjenih rezultata za dati kriterijum!» u slucaju da unos ne odgovara nijednoj koloni tj. redu iz tabele; takodje, unosom teksta u polje «pretrazi» se tabela automatski mora obnoviti (tako da uvek prikazuje sve redove koji odgovaraju unesenom tekstu ili da bude prazna u slucaju da uneseni tekst ne odgovara nijednom redu iz tabele).

6) Brisanje: U slucaju da je jedan red izabran, klikom na dugme «Obrisi», brise se dato vozilo ne samo iz tabele, vec i iz baze i uz to se prikazuje info. poruka: «Obrisano je vozilo koje je imalo id: $ID$ .». Nakon zatvaranja te poruke, prikazuje se tabela koja sadrzi sva ostala vozila (bez obrisanog vozila). U slucaju da nijedan red nije izabran, prikazuje se poruka: «Morate izabrati jedno vozilo za brisanje!».

7) Unos novog vozila: Klikom na dugme «Unos novog vozila», otvara se forma «Prijem novog vozila u servis» kojom se novo vozilo moze uneti u bazu.
