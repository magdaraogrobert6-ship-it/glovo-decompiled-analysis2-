package o;

import android.webkit.WebView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.state.searchshifts.presentation.timepicker.DualColumnTimePickerKt;
import com.roadrunner.vendor.review.presentation.option.VendorReviewOptionUiModelImpl;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.k$c;
import com.ui.common.widget.calendar.CalendarView;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.ranges.RangesKt;
import kotlin.text.RegexKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getPendingWebViewPauseRunnableandroid_sdk_ui_release implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ getPendingWebViewPauseRunnableandroid_sdk_ui_release(Object obj, int i, Object obj2) {
        this.read = i;
        this.write = obj;
        this.serializer = obj2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Object next;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj = this.serializer;
        Object obj2 = this.write;
        switch (i3) {
            case 0:
                getInAppMessageEventMap getinappmessageeventmap = (getInAppMessageEventMap) obj2;
                CharSequence charSequence = (CharSequence) obj;
                getinappmessageeventmap.getClass();
                charSequence.getClass();
                Matcher matcher = getinappmessageeventmap.nativePattern.matcher(charSequence);
                matcher.getClass();
                return RegexKt.write(matcher, 0, charSequence);
            case 1:
                addDate adddate = (addDate) obj;
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2).invoke(adddate.MediaDescriptionCompat, adddate.MediaSessionCompatQueueItem.name());
                return createfromparcel2;
            case 2:
                addMapJson addmapjson = (addMapJson) obj;
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2).invoke(addmapjson.RatingCompat, addmapjson.IconCompatParcelizer);
                return createfromparcel2;
            case 3:
                hasAllLocationsBeenRead hasalllocationsbeenread = (hasAllLocationsBeenRead) obj;
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2).invoke(Integer.valueOf(hasalllocationsbeenread.ComponentActivity), hasalllocationsbeenread.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                return createfromparcel2;
            case 4:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((hasAllLocationsBeenRead) obj).MediaSessionCompatToken);
                return createfromparcel2;
            case 5:
                int size = ((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj).size();
                int i4 = DualColumnTimePickerKt.IconCompatParcelizer;
                androidx.compose.foundation.lazy.LazyListMeasureResult lazyListMeasureResult = (androidx.compose.foundation.lazy.LazyListMeasureResult) ((androidx.compose.foundation.lazy.LazyListState) obj2).serializer();
                List list = lazyListMeasureResult.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (list.isEmpty()) {
                    list = null;
                }
                if (list == null) {
                    return null;
                }
                float f = (lazyListMeasureResult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys + lazyListMeasureResult.PlaybackStateCompat) / 2.0f;
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem = (androidx.compose.foundation.lazy.LazyListMeasuredItem) ((AnchoredDraggableKtrestartable212) next);
                        float fAbs = Math.abs(((lazyListMeasuredItem.ComponentActivity / 2.0f) + lazyListMeasuredItem.PlaybackStateCompat) - f);
                        do {
                            Object next2 = it.next();
                            androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem2 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) ((AnchoredDraggableKtrestartable212) next2);
                            float fAbs2 = Math.abs(((lazyListMeasuredItem2.ComponentActivity / 2.0f) + lazyListMeasuredItem2.PlaybackStateCompat) - f);
                            if (Float.compare(fAbs, fAbs2) > 0) {
                                next = next2;
                                fAbs = fAbs2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                AnchoredDraggableKtrestartable212 anchoredDraggableKtrestartable212 = (AnchoredDraggableKtrestartable212) next;
                if (anchoredDraggableKtrestartable212 == null) {
                    return null;
                }
                return Integer.valueOf(RangesKt.RemoteActionCompatParcelizer(((androidx.compose.foundation.lazy.LazyListMeasuredItem) anchoredDraggableKtrestartable212).MediaMetadataCompat - 1, 0, size - 1));
            case 6:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke((buildResponseData) obj);
                return createfromparcel2;
            case 7:
                getRawReferrer getrawreferrer = ((removeDeeplink) obj).RemoteActionCompatParcelizer;
                getrawreferrer.getClass();
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(getrawreferrer);
                return createfromparcel2;
            case 8:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj;
                int i5 = tryToGetResponse.IconCompatParcelizer[((androidx.compose.ui.state.ToggleableState) obj2).ordinal()];
                if (i5 == 1) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.TRUE);
                } else if (i5 == 2) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.FALSE);
                } else {
                    if (i5 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.TRUE);
                    int i6 = RemoteActionCompatParcelizer + 83;
                    IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
                return createfromparcel2;
            case 9:
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj;
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                Boolean bool = (Boolean) populateViewStructure_androidKtpopulate7.getValue();
                bool.getClass();
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(bool);
                return createfromparcel2;
            case 10:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke((UtilNetworking1) obj);
                return createfromparcel2;
            case 11:
                setRootAutofillId setrootautofillid = (setRootAutofillId) obj;
                execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand = ((setWebView) obj2).IconCompatParcelizer;
                if (execsessionsuccesscallbackcommand != null && (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = execsessionsuccesscallbackcommand.write) != null) {
                    int i8 = IconCompatParcelizer + 9;
                    RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                }
                CancellableContinuationImpl cancellableContinuationImpl = setrootautofillid.serializer;
                if (cancellableContinuationImpl.RemoteActionCompatParcelizer() instanceof onTouchEnded) {
                    cancellableContinuationImpl.resumeWith(performAutofill.ActionPerformed);
                }
                return createfromparcel2;
            case 12:
                ((r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds) obj2).IconCompatParcelizer.unregisterOnSharedPreferenceChangeListener((r8lambdaHRwluKqjD4JKfrQ9il45KizXUm4) obj);
                return createfromparcel2;
            case 13:
                ((r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds) obj2).IconCompatParcelizer.unregisterOnSharedPreferenceChangeListener((r8lambdaHRwluKqjD4JKfrQ9il45KizXUm4) obj);
                return createfromparcel2;
            case 14:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI) obj).serializer);
                return createfromparcel2;
            case 15:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((r8lambda5fC_TU5O34QRhL9Q2KJHThbLQz4) obj).write);
                return createfromparcel2;
            case 16:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((r8lambda5kWZVrTTOf4XktrICuq14WHMSQA) obj).read);
                return createfromparcel2;
            case 17:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((r8lambdaSMXleu3OAKzFKKf8k82rhwGl6hg) obj).write);
                return createfromparcel2;
            case 18:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((Map.Entry) obj).getKey());
                return createfromparcel2;
            case 19:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(Boolean.valueOf(!((r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c) obj).read));
                return createfromparcel2;
            case 20:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao) obj).IconCompatParcelizer);
                return createfromparcel2;
            case 21:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((logPushNotificationOpenedlambda1) obj).write);
                return createfromparcel2;
            case 22:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((logPushNotificationOpenedlambda30) obj).read);
                return createfromparcel2;
            case 23:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((logPushNotificationActionClickedlambda12) obj).serializer);
                return createfromparcel2;
            case 24:
                VendorReviewOptionUiModelImpl vendorReviewOptionUiModelImpl = (VendorReviewOptionUiModelImpl) obj2;
                vendorReviewOptionUiModelImpl.write.IconCompatParcelizer(new verifyProperSdkSetuplambda1(subscribeToNoMatchingTriggerForEventlambda0.NEGATIVE));
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj).invoke(Long.valueOf(vendorReviewOptionUiModelImpl.read));
                return createfromparcel2;
            case 25:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke((logPushDeliveryandroid_sdk_base_release) obj);
                return createfromparcel2;
            case 26:
                WebView webView = (WebView) obj;
                O$b o$b = (O$b) ((k$c) obj2).MediaSessionCompatQueueItem;
                if (webView != null) {
                    BuildersKt.write(new RxConvertKt$asFlow$1(o$b, webView, shortNewsContentCardView, 23));
                }
                return createfromparcel2;
            case 27:
                CalendarView calendarView = (CalendarView) obj2;
                int i10 = CalendarView.RemoteActionCompatParcelizer;
                calendarView.postDelayed(new Scopes$$ExternalSyntheticLambda0(calendarView, 18, (setSdkDebuggerCallbackandroid_sdk_base_release) obj), 300L);
                return createfromparcel2;
            default:
                InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer((Closeable) ((createInAppMessageEventSubscriber) obj2).IconCompatParcelizer);
                setRectf setrectf = (setRectf) ((createInAppMessageEventSubscriber) obj).IconCompatParcelizer;
                if (setrectf != null) {
                    int i11 = RemoteActionCompatParcelizer + 61;
                    IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i11 % 2 == 0) {
                        InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(setrectf);
                        int i12 = 34 / 0;
                    } else {
                        InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(setrectf);
                    }
                }
                return createfromparcel2;
        }
    }
}
