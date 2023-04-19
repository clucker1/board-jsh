package idusw.springboot.boradthymleaf.repository;

import idusw.springboot.boradthymleaf.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
