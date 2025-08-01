package br.com.dio.repository;

import br.com.dio.expcetion.InvestmentNotFoundException;
import br.com.dio.expcetion.WalletNotFoundException;
import br.com.dio.model.Investment;
import br.com.dio.model.InvestmentWallet;

import java.util.ArrayList;
import java.util.List;

import static br.com.dio.repository.CommonsRepository.checkFundsForTransaction;


public class InvestmentRespository {

    private final List<Investment> investments = new ArrayList<>();
    private final List<InvestmentWallet> wallets = new ArrayList<>();


    public InvestmentWallet deposit(final String pix, final long funds){
        var wallet = findWalletByAccountPix(pix);
        wallet.addMoney(wallet.getAccount().reduceMoney(funds), wallet.getService(), "Investimento");
        return wallet;

    }


    public InvestmentWallet withdraw(final String pix, final long funds) {
        var wallet = findWalletByAccountPix(pix);
        checkFundsForTransaction(wallet, funds);
        wallet.getAccount().addMoney(wallet.reduceMoney(funds), wallet.getService(), "saque de insvestimentos");
        if(wallet.getFunds() == 0 ){
            wallets.remove(wallet);
        }
        return wallet;
    }

    public void updateAmount(final long percent){
        wallets.forEach(w -> w.updateAmount(percent));
    }


    public Investment findById(final long id){
        return investments.stream().
                filter(a -> a.id() == id).
                findFirst().orElseThrow(() -> new InvestmentNotFoundException("O investimento '" + id + "' não foi encontrado "));
    }


    public InvestmentWallet findWalletByAccountPix(final String pix){
        return wallets.stream().
                filter(w -> w.getAccount().
                        getPix.contains(pix)).findFirst().orElseThrow(() -> new WalletNotFoundException("A carteira não foi encontrada"));
    }


    public List<InvestmentWallet> listWallets(){
        return this.wallets;
    }


    public List<Investment> list(){
        return this.investments
    }



}
