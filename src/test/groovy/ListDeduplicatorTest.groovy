import spock.lang.Specification
import com.aor.numbers.GenericSorter
import com.aor.numbers.ListDeduplicator

class ListDeduplicatorTest extends Specification {
    private def list,expected
    def setup() {
        list = Arrays.asList(1,2,4,2,5)
        expected = Arrays.asList(1,2,4,5)
    }
    def 'deduplicate'() {
        given:
        GenericSorter sorted = Mock(GenericSorter)
        sorted.sort() >> Arrays.asList(1,2,2,4,5)
        ListDeduplicator deduplicated =  new ListDeduplicator()
        when:
        List<Integer> r = deduplicated.deduplicate(list,sorted)
        then:
        r == expected
    }
}
