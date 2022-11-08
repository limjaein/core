package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    /*
        실무에서는 동시성 이슈때문에 HashMap 대신 ConcurrentHashMap 을 사용하는 게 좋다.
        예시에서는 HashMap으로 진행해보자.
     */
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
