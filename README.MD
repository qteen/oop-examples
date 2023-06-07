## Contoh OOP
---
- Interface adalah semacam class abstract yang berisi 1 atau lebih method kosong tanpa body.
Interface tidak dapat diinisialisasi menjad Object. 
Subclass dapat meggunakan/implements beberapa interface/
- Abstract Class adalah class yang tidak dapat diinisialisasi menjadi Object
- Encapsulation adalah mekanisme OOP untuk menyembunyikan detail sebuah class dari class lain. 
Contoh paling umum encapsulation di Java, adalah penggunaan scope attribut dan method.
  - Method/Attribute yang diset Private hanya bisa diakses di dalam class itu sendiri. 
  - Method/Attribute yang diset Protected hanya bisa diakses dari class itu sendiri dan subclassnya, serta semua class dalam package yang sama.
  - Method/Attribute yang tidak diset apapun (Default), hanya bisa diakses dari class itu sendiri dan semua class dalam package yang sama.