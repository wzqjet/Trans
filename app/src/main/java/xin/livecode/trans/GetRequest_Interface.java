package xin.livecode.trans;

/**
 * Created by wzq on 2018/3/22.
 */
import retrofit2.Call;
import retrofit2.http.GET;
public interface GetRequest_Interface {
    @GET("api/trans/vip/translate?q=apple&from=en&to=zh&appid=2015063000000001&salt=1435660288&sign=f89f9594663708c1605f3d736d01d2d4")
    Call<Translation> getCall();
}
