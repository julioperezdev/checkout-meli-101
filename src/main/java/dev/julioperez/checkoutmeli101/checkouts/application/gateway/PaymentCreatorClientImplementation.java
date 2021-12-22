package dev.julioperez.checkoutmeli101.checkouts.application.gateway;

import dev.julioperez.checkoutmeli101.checkouts.domain.dto.PaymentRequest;
import dev.julioperez.checkoutmeli101.checkouts.domain.dto.PaymentResponse;
import dev.julioperez.checkoutmeli101.checkouts.domain.model.Payment;
import dev.julioperez.checkoutmeli101.checkouts.domain.ports.PaymentCreatorClient;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class PaymentCreatorClientImplementation implements PaymentCreatorClient {

    private static final String HOST = "https://api.mercadopago.com/v1/payments";

    @Override
    public PaymentResponse createPayment(PaymentRequest paymentRequest) throws IOException {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPost paymentSchema = paymentRequestBuilder(paymentRequest);
            CloseableHttpResponse response = client.execute(paymentSchema);
            HttpEntity paymentResponseHttp = response.getEntity();
            return new PaymentResponse();
        }
    }


    private HttpPost paymentRequestBuilder(PaymentRequest paymentRequest) throws UnsupportedEncodingException {
        HttpPost paymentCreation = new HttpPost(HOST);

        List<NameValuePair> params = new ArrayList<NameValuePair>();

        params.add(new BasicNameValuePair("binary_mode", paymentRequest.getBinaryMode().toString()));
        params.add(new BasicNameValuePair("application_fee", paymentRequest.getApplicationFee().toString()));
        params.add(new BasicNameValuePair("item.title", paymentRequest.getProductTitle()));
        params.add(new BasicNameValuePair("item.description", paymentRequest.getProductDescription()));
        params.add(new BasicNameValuePair("item.picture_url", paymentRequest.getProductImageUrl()));
        params.add(new BasicNameValuePair("item.quantity", paymentRequest.getProductQuantity().toString()));
        params.add(new BasicNameValuePair("item.unit_price", paymentRequest.getProductUnitPrice().toString()));

        paymentCreation.setEntity(new UrlEncodedFormEntity(params));
        return paymentCreation;
    }

    private PaymentResponse paymentResponseBuilder (HttpEntity responseEntity){
        PaymentResponse paymentResponse = new PaymentResponse();
        //should get response object to mapping PaymentResponse
        return paymentResponse;
    }
}
