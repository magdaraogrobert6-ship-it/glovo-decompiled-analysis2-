package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.sentry.SentryBaseEvent;
import io.sentry.exception.ExceptionMechanismException;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class BannerViewExternalSyntheticLambda2 extends SentryBaseEvent implements RequestPushPermissionStep {
    public r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8 ComponentActivity;
    public List ResultReceiver;
    public io.sentry.protocol.r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public String r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8 r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public ConcurrentHashMap r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public AbstractMap r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public Date r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public String r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;

    public BannerViewExternalSyntheticLambda2() {
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = new io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
        Date dateSerializer = setNativeShader.serializer();
        super(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = dateSerializer;
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("timestamp");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
            okHttpCall$1.write("message");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        }
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
            okHttpCall$1.write("logger");
            okHttpCall$1.IconCompatParcelizer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        }
        r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8 r8lambdae2bxepptxpg5qj9wrzyqgcf9s8 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (r8lambdae2bxepptxpg5qj9wrzyqgcf9s8 != null && !r8lambdae2bxepptxpg5qj9wrzyqgcf9s8.read.isEmpty()) {
            okHttpCall$1.write("threads");
            okHttpCall$1.write();
            okHttpCall$1.write("values");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read);
            okHttpCall$1.RatingCompat();
        }
        r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8 r8lambdae2bxepptxpg5qj9wrzyqgcf9s9 = this.ComponentActivity;
        if (r8lambdae2bxepptxpg5qj9wrzyqgcf9s9 != null && !r8lambdae2bxepptxpg5qj9wrzyqgcf9s9.read.isEmpty()) {
            okHttpCall$1.write("exception");
            okHttpCall$1.write();
            okHttpCall$1.write("values");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.ComponentActivity.read);
            okHttpCall$1.RatingCompat();
        }
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            okHttpCall$1.write("level");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        }
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
            okHttpCall$1.write("transaction");
            okHttpCall$1.IconCompatParcelizer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        }
        if (this.ResultReceiver != null) {
            okHttpCall$1.write(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.ResultReceiver);
        }
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != null) {
            okHttpCall$1.write("modules");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        }
        coil3.util.UtilsKt.IconCompatParcelizer(this, okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        ConcurrentHashMap concurrentHashMap = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final boolean read() {
        r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8 r8lambdae2bxepptxpg5qj9wrzyqgcf9s8 = this.ComponentActivity;
        return (r8lambdae2bxepptxpg5qj9wrzyqgcf9s8 == null || r8lambdae2bxepptxpg5qj9wrzyqgcf9s8.read.isEmpty()) ? false : true;
    }

    public final ArrayList serializer() {
        r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8 r8lambdae2bxepptxpg5qj9wrzyqgcf9s8 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (r8lambdae2bxepptxpg5qj9wrzyqgcf9s8 != null) {
            return r8lambdae2bxepptxpg5qj9wrzyqgcf9s8.read;
        }
        return null;
    }

    public final io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 write() {
        Boolean bool;
        r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8 r8lambdae2bxepptxpg5qj9wrzyqgcf9s8 = this.ComponentActivity;
        if (r8lambdae2bxepptxpg5qj9wrzyqgcf9s8 == null) {
            return null;
        }
        for (io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8 : r8lambdae2bxepptxpg5qj9wrzyqgcf9s8.read) {
            io.sentry.protocol.ParcelableVolumeInfo parcelableVolumeInfo = r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.write;
            if (parcelableVolumeInfo != null && (bool = parcelableVolumeInfo.serializer) != null && !bool.booleanValue()) {
                return r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8;
            }
        }
        return null;
    }

    public final ArrayList RemoteActionCompatParcelizer() {
        r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8 r8lambdae2bxepptxpg5qj9wrzyqgcf9s8 = this.ComponentActivity;
        if (r8lambdae2bxepptxpg5qj9wrzyqgcf9s8 == null) {
            return null;
        }
        return r8lambdae2bxepptxpg5qj9wrzyqgcf9s8.read;
    }

    public BannerViewExternalSyntheticLambda2(ExceptionMechanismException exceptionMechanismException) {
        this();
        this.MediaSessionCompatToken = exceptionMechanismException;
    }
}
