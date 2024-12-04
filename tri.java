function insertionSort(arr) {
    // Parcours de chaque élément à partir du deuxième (index 1)
    for (let i = 1; i < arr.length; i++) {
        // L'élément à insérer dans la séquence triée
        let current = arr[i];
        // Initialisation de la position de comparaison
        let j = i - 1;

        // Décalage des éléments plus grands vers la droite
        while (j >= 0 && arr[j] > current) {
            arr[j + 1] = arr[j];
            j--;
        }

        // Insérer l'élément au bon endroit
        arr[j + 1] = current;
    }

    return arr;
}

// Exemple d'utilisation
let array = [5, 2, 9, 1, 5, 6];
console.log(insertionSort(array));  // Affiche [1, 2, 5, 5, 6, 9]
