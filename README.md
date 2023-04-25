### Saya Muhammad Yusuf Bahtiar NIM 2107980 mengerjakan Latihan 7 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
<br>

## Deskripsi Tugas
Modifikasi kode yang sudah diberikan, dengan ketentuan sebagai berikut:
* Pemain mengendalikan bola. Setiap kali bola bergerak, skor pemain bertambah +1.
* Skor hanya bertambah jika pemain berbelok, bukan bergerak berurutan. Detail:
   - Saat pertama kali membuka program, pemain bergerak ke arah manapun, skor +1.
   - Setelah pemain bergerak, dia harus bergerak ke arah lain agar skornya +1. Jika menekan tombol yang sama, skor tetap (+0).
   - Contoh, pemain membuka program, lalu bergerak ke kanan dan berhenti, maka skor bertambah +1. Jika pemain bergerak ke arah atas, bawah, atau kiri, maka skor bertambah      +1. Namun, jika pemain bergerak ke kanan lagi, maka skor +0.
   - Bagaimana jika urutannya, kanan - atas - kiri - kanan? Kanan yang kedua tetap +1, karena pergerakan pemain sebelumnya adalah kiri, sehingga tidak dianggap berurutan.
* Buatlah sistem game yang menambahkan satu kotak atau objek apapun secara acak. Jika pemain menyentuh objek tersebut, skor bertambah +5 atau +10, lalu objek akan berpindah lagi ke posisi lain secara acak.
<br>

## Desain Program
Program didesain dalam 9 class, diantaranya:
1. Class *Box*, Class *Box* merupakan subclass dari Class `GameObject`, mewarisi semua method dan atribut dari Class `GameObject`.
2. Class *Controller*, Class *Controller* memiliki Class `Game` dan Class `Handler`.
3. Class *Display*, Class *Display* berfungsi untuk mengatur tampilan layar.
4. Class *Game*, Class *Game* memiliki Class `Display` dan Class `Handler`.
5. Class *GameInterface*, Class *GameInterface* merupakan class interface yang mana semua method pada Class tersebut akan diimplementasikan pada Class lain.
6. Class *GameObject*, Class *GameObject* berfungsi untuk membuat/menampung atribut penyusun suatu objek yang akan dibuat di dalam game.
7. Class *Handler*, Class *Handler* berfungsi untuk menyimpan semua objek yang akan ditampilkan di dalam game.
8. Class *Player*, Class *Player* merupakan subclass dari Class `GameObject`, mewarisi semua method dan atribut dari Class `GameObject`.
9. Class *Synchronization*, Class *Synchronization* merupakan main frame yang berfungsi untuk menjalankan game.
<br>

## Alur Program
Program akan menampilkan frame berisi 2 objek, yakni objek _player_ yang direpresentasikan dalam bentuk lingkaran dan objek _box_ yang direpresentasikan dalam bentuk persegi. Tombol untuk mengendalikan objek _player_ dapat menggunakan _WASD_ atau _arrow key_, informasi _score_ yang ditampilkan di layar akan bertambah +1 ketika _user_ menggerakkan objek _player_ berganti-ganti arah (sesuai deskripsi tugas). Terdapat juga sistem collision, yakni ketika objek _player_ mengenai objek _box_, maka _score_ terkini akan ditambah +5, objek _box_ tersebut akan dihapus dan dibuat kembali, tetapi ditempatkan secara acak.

<br>

## Dokumentasi
https://user-images.githubusercontent.com/100776170/234237949-207fedb9-169a-4b7b-a0f5-7d95a44ab3ab.mp4
