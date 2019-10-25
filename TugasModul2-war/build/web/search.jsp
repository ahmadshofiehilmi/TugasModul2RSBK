<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Mesin Pencari Mahasiswa</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
    <header>
      <h1 style="text-align:center">SEMANGAT, TAHUN DEPAN WISUDAA</h1>
    </header>
    <main style="display:flex;justify-content:center;flex-direction: column;">
            <form action="search" method="post" style="display:flex;justify-content:center;flex-direction: column;align-items: center;">
                <label for="nama" style="margin-bottom:5px">Cari Mahasiswa</label>
                <input id="nama" type="text" name="param" placeholder="Masukan Nama / NIM">
                <span style="color:red">${show}</span>
                <br>
                <input type="submit" name="submit" value="Cari" style="width:150px">
                <br>
                <label for="nama" style="margin-bottom:5px">Tambah</label>
                <input id="nama" type="text" name="param" placeholder="Masukan Nama / NIM">
            </form>
    </main><br>
    <footer style="text-align:center">&copy; Copyright Praktikum Rekayasa Perangkat Lunak 2019</footer>
  </body>
</html>
