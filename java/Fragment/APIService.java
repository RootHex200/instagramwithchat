package Fragment;


import com.example.instragramprojectof.Notification.MyResponse;
import com.example.instragramprojectof.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAIYTs87M:APA91bEZO5FOHlYSjc8_Q637gekpyZLHa4g9SZm2VBm_ggTV34gv29ozD1cCSHSwCvHH1-6Spwsn5ybYtsJK7G9UlC7q4tgJCatnwngHUH6st-knwGbABz3FcnsPYr0hkYfDwZVEpfSi"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
