package o;

import com.sentiance.core.model.events.ThriftBool;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaktUwDO8RPEp6TXsZES7mdRqVXc {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;

    public r8lambdaktUwDO8RPEp6TXsZES7mdRqVXc(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public final List<getImageStyle> write(getLongitudeannotations<onReceivelambda0> getlongitudeannotations) {
        onReceivelambda0 onreceivelambda0 = getlongitudeannotations.read();
        String string = UUID.randomUUID().toString();
        long jWrite = getlongitudeannotations.write();
        this.read.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        return Collections.singletonList(getImageStyle.RemoteActionCompatParcelizer(new r8lambda92cmOJndUFWJcG9v70hQ0grNTsw(string, jWrite, jWrite, onreceivelambda0.IconCompatParcelizer.intValue(), onreceivelambda0.serializer == ThriftBool.TRUE, jCurrentTimeMillis, jCurrentTimeMillis)));
    }
}
