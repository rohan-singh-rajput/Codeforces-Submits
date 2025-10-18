#include<iostream>

using namespace std;

int main(void){
    int a,b;
    cin>>a>>b;

    int res1 = min(a,b);
    cout<<res1<<" ";
    int res2 = max((a-min(a,b))/2,(b- min(a,b))/2);
    cout<<res2<<endl;
    return 0;
}