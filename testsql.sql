# mencari ponsel
kurangtepat
yang benar adalah : 
SELECT Ponsel.Merk, COUNT(Ponsel.Model)
FROM Ponsel 
WHERE Ponsel.DualSim = Ya;

# mencari pahlawan super
SELECT DISTINCT PahlawanSuper.TempatTinggal FROM PahlawanSuper 
JOIN Senjata on PahlawanSuper.ID = Senjata.PahlawanSuperID 
JOIN JenisSenjata on JenisSenjata.ID = Senjata.JenisSenjataID WHERE JenisSenjata.JenisSenjata ='Kapak'

# mencari cinta yang hilang
SELECT Penduduk.Nama FROM Penduduk JOIN Pasangan on Penduduk.ID = Pasangan.PendudukID 
JOIN Perpisahan on Pasangan.ID = Perpisahan.PasanganID 
ORDER BY Perpisahan.TanggalPisah DESC LIMIT 0,100