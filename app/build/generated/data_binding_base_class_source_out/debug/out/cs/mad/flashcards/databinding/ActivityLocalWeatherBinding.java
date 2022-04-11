// Generated by view binder compiler. Do not edit!
package cs.mad.flashcards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import cs.mad.flashcards.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLocalWeatherBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView cityValue;

  @NonNull
  public final TextView localWeatherTitle;

  @NonNull
  public final TextView tempValue;

  @NonNull
  public final TextView windSpeedValue;

  private ActivityLocalWeatherBinding(@NonNull RelativeLayout rootView, @NonNull TextView cityValue,
      @NonNull TextView localWeatherTitle, @NonNull TextView tempValue,
      @NonNull TextView windSpeedValue) {
    this.rootView = rootView;
    this.cityValue = cityValue;
    this.localWeatherTitle = localWeatherTitle;
    this.tempValue = tempValue;
    this.windSpeedValue = windSpeedValue;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLocalWeatherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLocalWeatherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_local_weather, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLocalWeatherBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.city_value;
      TextView cityValue = rootView.findViewById(id);
      if (cityValue == null) {
        break missingId;
      }

      id = R.id.local_weather_title;
      TextView localWeatherTitle = rootView.findViewById(id);
      if (localWeatherTitle == null) {
        break missingId;
      }

      id = R.id.temp_value;
      TextView tempValue = rootView.findViewById(id);
      if (tempValue == null) {
        break missingId;
      }

      id = R.id.wind_speed_value;
      TextView windSpeedValue = rootView.findViewById(id);
      if (windSpeedValue == null) {
        break missingId;
      }

      return new ActivityLocalWeatherBinding((RelativeLayout) rootView, cityValue,
          localWeatherTitle, tempValue, windSpeedValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
