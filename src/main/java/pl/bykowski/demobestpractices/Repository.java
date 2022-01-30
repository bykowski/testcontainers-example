package pl.bykowski.demobestpractices;


import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Person, Long> {
}
