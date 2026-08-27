package io.sentry.internal.modules;

import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer extends IconCompatParcelizer {
    public final Pattern IconCompatParcelizer;
    public final Pattern serializer;
    public final ClassLoader write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public serializer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        super(brazeActionParserExternalSyntheticLambda0);
        ClassLoader classLoader = serializer.class.getClassLoader();
        this.IconCompatParcelizer = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.serializer = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.write = io.sentry.util.serializer.read(classLoader);
    }

    @Override // io.sentry.internal.modules.IconCompatParcelizer
    public final Map RemoteActionCompatParcelizer() {
        HashMap map = new HashMap();
        ArrayList<write> arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.write.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Matcher matcher = this.IconCompatParcelizer.matcher(resources.nextElement().toString());
                write writeVar = null;
                String strGroup = (matcher.matches() && matcher.groupCount() == 1) ? matcher.group(1) : null;
                if (strGroup != null) {
                    Matcher matcher2 = this.serializer.matcher(strGroup);
                    if (matcher2.matches() && matcher2.groupCount() == 2) {
                        writeVar = new write(matcher2.group(1), matcher2.group(2));
                    }
                }
                if (writeVar != null) {
                    arrayList.add(writeVar);
                }
            }
        } catch (Throwable th) {
            this.MediaSessionCompatQueueItem.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Unable to detect modules via manifest files.", th);
        }
        for (write writeVar2 : arrayList) {
            map.put(writeVar2.RemoteActionCompatParcelizer, writeVar2.read);
        }
        return map;
    }
}
