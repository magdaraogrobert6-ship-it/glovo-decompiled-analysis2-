package com.mapbox.navigation.ui.components.maneuver.model;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import com.mapbox.navigation.tripdata.maneuver.model.RoadShieldComponentNode;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxExitText;
import java.util.Iterator;
import java.util.Set;
import o.isAppSetIdReadingEnabled;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ManeuverInstructionGenerator {
    public static void addExitToBuilder(String str, MapboxExitText mapboxExitText, int i, Resources resources, SpannableStringBuilder spannableStringBuilder) {
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        mapboxExitText.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        mapboxExitText.layout(0, 0, mapboxExitText.getMeasuredWidth(), mapboxExitText.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(mapboxExitText.getMeasuredWidth(), mapboxExitText.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        bitmapCreateBitmap.eraseColor(0);
        mapboxExitText.draw(new Canvas(bitmapCreateBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapCreateBitmap);
        bitmapDrawable.setBounds(0, 0, (int) ((((double) i) * ((double) bitmapCreateBitmap.getWidth())) / ((double) bitmapCreateBitmap.getHeight())), i);
        spannableStringBuilder2.setSpan(new ImageSpan(bitmapDrawable), 0, str.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        spannableStringBuilder.append(" ");
    }

    public static void addShieldToBuilder(String str, Resources resources, SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append((CharSequence) new SpannableStringBuilder(str));
        spannableStringBuilder.append(" ");
    }

    public static void getShieldToRender(RoadShieldComponentNode roadShieldComponentNode, Set set) {
        if (roadShieldComponentNode.mapboxShield != null && set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    int iSerializer = isAppSetIdReadingEnabled.serializer();
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
                    return;
                }
            }
        }
        if (roadShieldComponentNode.shieldUrl == null || set == null) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (it2.next() != null) {
                int iSerializer2 = isAppSetIdReadingEnabled.serializer();
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer2);
                return;
            }
        }
    }
}
