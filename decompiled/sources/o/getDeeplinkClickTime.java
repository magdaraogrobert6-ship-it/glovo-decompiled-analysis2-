package o;

import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeeplinkClickTime {
    public final NestComponentRepositoryImpl serializer;
    public final IOParser$Decoder write;

    public getDeeplinkClickTime(NestComponentRepositoryImpl nestComponentRepositoryImpl, IOParser$Decoder iOParser$Decoder) {
        this.serializer = nestComponentRepositoryImpl;
        this.write = iOParser$Decoder;
    }
}
