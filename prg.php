<?php


$nilai = [2, 7, 11, 15];

echo "Masukan nilai:";
$input = trim(fgets(STDIN));


if ($input >= $nilai[3]) {
    $hasil = $input - $nilai[3];
    $h1 = $nilai[3];
} else if ($input >= $nilai[2]) {
    $hasil = $input - $nilai[2];
    $h1 = $nilai[2];
} else if ($input >= $nilai[1]) {
    $hasil =  $nilai[0];
    $h1 = $nilai[1];
} else {
}
$ha = array_search($hasil, $nilai);
$ho = array_search($h1, $nilai);


print_r("[$ha, $ho]");
