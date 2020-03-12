inputan = (nilai) => {

  let rentang = []
  let jarak, maximal
  let error = 0

  for (let i = 0; i < nilai.length; i++) {

    if (nilai[i] > nilai[i + 1]) {
      error += 1
    }

    for (let x = i + 1; x < nilai.length; x++) {

      if (nilai[i] < nilai[x]) {
        jarak = nilai[x] - nilai[i]
        rentang.push(jarak)
      }
    }

  }
  if (error == nilai.length - 1) {
    console.log("harga selalu turun")
  } else {
    maximal = Math.max(...rentang)
    console.log(maximal)
  }

}

inputan([10, 15, 8, 7, 14])