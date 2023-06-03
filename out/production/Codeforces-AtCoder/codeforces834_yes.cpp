using namespace std;
#include <iostream>
#include <bits/stdc++.h>
#define ll long long


int main()
{

    ll example;
    cin>>example;
    while(example--){
        ll kitna;
        cin>>kitna;
        string kaise;
        cin>>kaise;
        ll manuaage = 0;
        ll manuneeche = 0;
        int count=0;
        for(auto i : kaise){
            if(i=='U')
                manuneeche++;
            else if (i=='D')
                manuneeche--;
            else if (i=='R')
                manuaage++;
            else
                manuaage--;
        }
        if(manuaage == 1 && manuneeche == 1){
            count=1;
            break;
        }
        if(count==0)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
}
