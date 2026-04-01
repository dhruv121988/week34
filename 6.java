static int[] floorCeil(int[] arr, int target) {
    int low = 0, high = arr.length - 1;
    int floor = -1, ceil = -1;

    while (low <= high) {
        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return new int[]{arr[mid], arr[mid]};
        } else if (arr[mid] < target) {
            floor = arr[mid];
            low = mid + 1;
        } else {
            ceil = arr[mid];
            high = mid - 1;
        }
    }

    return new int[]{floor, ceil};
}