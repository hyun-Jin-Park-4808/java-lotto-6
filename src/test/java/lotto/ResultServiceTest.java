package lotto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ResultServiceTest {

    @DisplayName("로또 수량을 제대로 계산하는 지 테스트한다.")
    @Test
    void calculateNumberOfLottoTicketsTest() {
        // given
        int purchaseAmount = 9000;

        // when & then
        assertThat(ResultService.calculateNumberOfLottoTickets(purchaseAmount))
                .isEqualTo(9);
    }




}