//One element at time
for (int i = 0; i < array.length; i++) {
    array[i] = i + 2;
}

//Multiple element at time
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 5; j++) {
        array[i][j] = j + 1;
    }
}
