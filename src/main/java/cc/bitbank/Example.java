package cc.bitbank;

import cc.bitbank.entity.Assets;
import cc.bitbank.entity.Order;
import cc.bitbank.entity.enums.CurrencyPair;
import cc.bitbank.entity.enums.OrderSide;
import cc.bitbank.entity.enums.OrderType;
import cc.bitbank.exception.BitbankException;

import java.math.BigDecimal;
import java.util.ResourceBundle;


/**
 * Created by tanaka on 2017/04/11.
 */
public class Example {
    public static void main(String args[]) {
        ResourceBundle rb = ResourceBundle.getBundle("example");

        Bitbankcc bb = new Bitbankcc();
        bb.setKey(rb.getString("key"), rb.getString("secret"));

        try {
//            bb.getTicker(CurrencyPair.BTC_JPY);
//            bb.getDepth(CurrencyPair.BTC_JPY);
//            bb.getTransaction(CurrencyPair.BTC_JPY).transactions[0].price
//            bb.getTransaction(CurrencyPair.BTC_JPY, "20170410").transactions[0]
//            bb.getCandlestick(CurrencyPair.BTC_JPY, CandleType._1DAY, "2017").candlestick[0].getOhlcvList()

//            Assets as = bb.getAsset();
//            System.out.println(as.assets[0]);
//
            Order order = bb.getOrder(CurrencyPair.BTC_JPY, 90956209);
            System.out.println(order);
            System.out.println(order.canceledAt);
//
//            Order order2 = bb.sendOrder(CurrencyPair.BTC_JPY, 10000, BigDecimal.valueOf(0.01), OrderSide.BUY, OrderType.LIMIT);
//            System.out.println(order2);

//            Order order3 = bb.cancelOrder(CurrencyPair.BTC_JPY, 129781978);
//            System.out.println(order3);


        } catch (BitbankException e) {
            System.out.println(e.code);
        } catch (Exception e) {
            System.out.println("エラー " + e.getMessage());
            e.printStackTrace();
        }
    }
}
