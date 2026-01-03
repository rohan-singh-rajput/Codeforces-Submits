#include <iostream>
#include <iomanip>

using namespace std;

int main(void)
{
    int n;
    cin >> n;

    double res = 0.0;

    for (int i = 0; i < n; i++)
    {
        double temp;
        cin >> temp;

        res = res + (temp / 100.0);
    }

    std::cout << std::fixed << std::setprecision(12);
    cout << (double)(res * 100.00) / n << endl;

    return 0;
}